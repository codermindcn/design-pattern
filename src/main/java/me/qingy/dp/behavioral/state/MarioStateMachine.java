package me.qingy.dp.behavioral.state;

import lombok.Getter;

/**
 * 骨架代码，需补全事件
 *
 * @author qingy
 * @since 2021-08-05
 */
@Getter
public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    public void obtainMushRoom() {
        //TODO
    }

    public void obtainCape() {
        //TODO
    }

    public void obtainFireFlower() {
        //TODO
    }

    public void meetMonster() {
        //TODO
    }
}
