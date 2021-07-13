package me.qingy.principle.solid.ocp.ocp;

/**
 * @author qingy
 * @since 2021/6/8
 */
public class Demo {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        // ... 省略设置 apiStatInfo 数据值的代码
        apiStatInfo.setTimeoutCount(289); // 改动四:设置 tiemoutCount 值
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
