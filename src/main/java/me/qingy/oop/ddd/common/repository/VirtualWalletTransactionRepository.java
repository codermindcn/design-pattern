package me.qingy.oop.ddd.common.repository;

import me.qingy.oop.ddd.common.entity.VirtualWalletTransactionEntity;

/**
 * @author qingy
 * @since 2021/6/7
 */
public class VirtualWalletTransactionRepository {
    public Long saveTransaction(VirtualWalletTransactionEntity transactionEntity) {
        return 0L;
    }

    public void updateStatus(Long transactionId, Integer closed) {
    }
}
