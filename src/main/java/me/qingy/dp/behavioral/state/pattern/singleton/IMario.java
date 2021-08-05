package me.qingy.dp.behavioral.state.pattern.singleton;

import me.qingy.dp.behavioral.state.State;

/**
 * @author qingy
 * @since 2021-08-05
 */
public interface IMario {
    State getName();

    void obtainMushRoom(MarioStateMachine stateMachine);

    void obtainCape(MarioStateMachine stateMachine);

    void obtainFireFlower(MarioStateMachine stateMachine);

    void meetMonster(MarioStateMachine stateMachine);
}
