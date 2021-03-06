package me.qingy.dp.structural.bridge;

/**
 * 将不同渠道的发送逻辑从 Notification 剥离出来，形成独立的消息发送类（MsgSender）
 *
 * 抽象：Notification
 * 实现：MsgSender
 *
 * 两者可以独立开发，通过组合关系（也就是桥梁）任意组合在一起。
 * 所谓任意组合是指不同紧急程度的消息和发送渠道之间的对应关系不是在代码中固定写死的，而是可以动态地去指定（比如：通过读取配置来获取对应关系）。
 *
 * @see me.qingy.principle.solid.ocp.normal.Notification
 * @author qingy
 * @since 2021-08-02
 */
public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
