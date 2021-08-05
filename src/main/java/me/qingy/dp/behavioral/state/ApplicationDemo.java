package me.qingy.dp.behavioral.state;

import me.qingy.dp.behavioral.state.pattern.normal.MarioStateMachine;

/**
 * @author qingy
 * @since 2021-08-05
 */
public class ApplicationDemo {
    public static void main(String[] args) {
        MarioStateMachine mario = new MarioStateMachine();
        mario.obtainMushRoom();
        int score = mario.getScore();
        State state = mario.getCurrentState();
        System.out.println("mario score: " + score + "; state: " + state);
    }
}
