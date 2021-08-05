package me.qingy.dp.behavioral.state.pattern.singleton;

import me.qingy.dp.behavioral.state.State;

/**
 * @author qingy
 * @since 2021-08-05
 */
public class FireMario implements IMario {
    private static final FireMario instance = new FireMario();

    private FireMario() {
    }

    public static FireMario getInstance() {
        return instance;
    }

    @Override
    public State getName() {
        return State.SMALL;
    }

    @Override
    public void obtainMushRoom(MarioStateMachine stateMachine) {
        // do nothing...
    }

    @Override
    public void obtainCape(MarioStateMachine stateMachine) {
        // do nothing...
    }

    @Override
    public void obtainFireFlower(MarioStateMachine stateMachine) {
        // do nothing...
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 300);
    }
}
