package me.qingy.dp.behavioral.state.table;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author qingy
 * @since 2021-08-05
 */
@Getter
@AllArgsConstructor
public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);

    private int value;
}
