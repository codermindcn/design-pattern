package me.qingy.dp.behavioral.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * @author qingy
 * @since 2021-08-05
 */
@Getter
@AllArgsConstructor
public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;
}
