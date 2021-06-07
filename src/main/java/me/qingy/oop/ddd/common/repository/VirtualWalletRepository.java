package me.qingy.oop.ddd.common.repository;

import me.qingy.oop.ddd.normal.VirtualWalletEntity;

import java.math.BigDecimal;

/**
 * @author qingy
 * @since 2021/6/7
 */
public class VirtualWalletRepository {
    public VirtualWalletEntity getWalletEntity(Long walletId) {
        return new VirtualWalletEntity();
    }

    public BigDecimal getBalance(Long walletId) {
        return null;
    }

    public void updateBalance(Long walletId, BigDecimal subtract) {
    }
}
