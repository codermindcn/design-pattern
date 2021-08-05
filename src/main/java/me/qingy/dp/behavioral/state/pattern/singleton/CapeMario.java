package me.qingy.dp.behavioral.state.pattern.singleton;

import me.qingy.dp.behavioral.state.State;

/**
 * @author qingy
 * @since 2021-08-05
 */
public class CapeMario implements IMario {
    private static final CapeMario instance = new CapeMario();

    private CapeMario() {
    }

    public static CapeMario getInstance() {
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
        stateMachine.setCurrentState(FireMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() + 300);
    }

    @Override
    public void meetMonster(MarioStateMachine stateMachine) {
        stateMachine.setCurrentState(SmallMario.getInstance());
        stateMachine.setScore(stateMachine.getScore() - 200);
    }
}
