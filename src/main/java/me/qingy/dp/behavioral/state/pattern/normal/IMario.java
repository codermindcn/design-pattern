package me.qingy.dp.behavioral.state.pattern.normal;

import me.qingy.dp.behavioral.state.State;

/**
 * 所有状态类的接口
 *
 * @author qingy
 * @since 2021-08-05
 */
public interface IMario {
    State getName();

    // 以下是定义的事件
    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
