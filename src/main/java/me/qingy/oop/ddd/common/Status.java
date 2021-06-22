package me.qingy.oop.ddd.common;

/**
 * @author qingy
 * @since 2021/6/7
 */
public interface Status {
    Integer TO_BE_EXECUTED = 0;
    Integer CLOSED = 1;
    Integer FAILED = 2;
    Integer EXECUTED = 3;
}
