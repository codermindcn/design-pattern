package me.qingy.oop.ddd.common.controller;

import me.qingy.oop.ddd.normal.VirtualWalletService;

import java.math.BigDecimal;

/**
 * @author qingy
 * @since 2021/6/7
 */
public class VirtualWalletController {

    private VirtualWalletService virtualWalletService;

    /**
     * 查询余额
     */
    public BigDecimal getBalance(Long walletId) {
        return null;
    }

    /**
     * 出账
     */
    public void debit(Long walletId, BigDecimal amount) {
    }

    /**
     * 入账
     */
    public void credit(Long walletId, BigDecimal amount) {
    }

    /**
     * 转账
     */
    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
    }
}
