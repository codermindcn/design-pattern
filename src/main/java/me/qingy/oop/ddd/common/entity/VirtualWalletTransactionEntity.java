package me.qingy.oop.ddd.common.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author qingy
 * @since 2021/6/7
 */
@Data
public class VirtualWalletTransactionEntity {
    private Long fromWalletId;
    private Long toWalletId;
    private BigDecimal amount;
    private Integer status;
    private Long createTime;
}
