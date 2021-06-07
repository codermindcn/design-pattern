package me.qingy.oop.ddd.common.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author qingy
 * @since 2021/6/7
 */
@Data
public class VirtualWalletBo {
    private Long id;
    private Long createTime;
    private BigDecimal balance;
}
