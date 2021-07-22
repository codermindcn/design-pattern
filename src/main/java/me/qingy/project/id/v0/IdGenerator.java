package me.qingy.project.id.v0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @author qingy
 * @since 2021-07-22
 */
public class IdGenerator { // 常规问题一 没有做到面向接口编程

    private static final Logger logger = LoggerFactory.getLogger(IdGenerator.class);

    public static String generate() { // 常规问题二 可测试性差（静态函数、InetAddress、Random、currentTimeMillis）
        String id = "";
        try {
            String hostName = InetAddress.getLocalHost().getHostName(); // 业务问题三 获取主机名性能开销
            String[] tokens = hostName.split("\\."); // 业务问题一 判空
            if (tokens.length > 0) {
                hostName = tokens[tokens.length - 1];
            }
            char[] randomChars = new char[8];
            int count = 0;
            Random random = new Random();
            while (count < 8) { // 常规问题三 可读性差
                int randomAscii = random.nextInt(122);
                if (randomAscii >= 48 && randomAscii <= 57) { // 非共性问题一 if简化
                    randomChars[count] = (char)('0' + (randomAscii - 48));
                    count++;
                } else if (randomAscii >= 65 && randomAscii <= 90) {
                    randomChars[count] = (char)('A' + (randomAscii - 65));
                    count++;
                } else if (randomAscii >= 97 && randomAscii <= 122) {
                    randomChars[count] = (char)('a' + (randomAscii - 97));
                    count++;
                }
            }
            id = String.format("%s-%d-%s", hostName,
                    System.currentTimeMillis(), new String(randomChars));
        } catch (UnknownHostException e) {
            logger.warn("Failed to get the host name.", e); // 业务问题二 异常没有向上抛出
        }

        return id;
    }

}
