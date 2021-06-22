package me.qingy.oop.ddd.common.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author qingy
 * @since 2021/6/7
 */
@Data
public class VirtualWalletEntity {
    private Long id;
    private Long createDate;
    private BigDecimal balance;
}
