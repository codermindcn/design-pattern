package me.qingy.dp.structural.decorator;

import java.io.*;

/**
 * 装饰器模式与简单的组合关系有两点不同：
 *
 * @author qingy
 * @since 2021-08-02
 */
public class Test {
    public static void main(String[] args) throws IOException {
        // 1.装饰器类和原始类继承同样的父类，这样可以对原始类“嵌套”多个装饰器类进行功能增强。
        InputStream fileInputStream = new FileInputStream("");
        InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        InputStream dataInputStream = new DataInputStream(bufferedInputStream);

        // 2.装饰器类是对原有功能的增强。
        dataInputStream.read();
    }
}
