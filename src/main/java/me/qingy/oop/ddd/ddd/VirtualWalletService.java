package me.qingy.oop.ddd.ddd;

import me.qingy.oop.ddd.normal.VirtualWalletEntity;
import me.qingy.oop.ddd.common.repository.VirtualWalletRepository;
import me.qingy.oop.ddd.common.repository.VirtualWalletTransactionRepository;

import java.math.BigDecimal;

/**
 * @author qingy
 * @since 2021/6/7
 */
public class VirtualWalletService {
    private VirtualWalletRepository walletRepo;
    private VirtualWalletTransactionRepository transactionRepo;

    public VirtualWallet getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        return wallet;
    }

    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    public void debit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.debit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    public void credit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.credit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        //... 跟基于贫血模型的传统开发模式的代码一样...
    }

    private VirtualWallet convert(VirtualWalletEntity walletEntity) {
        return null;
    }
}
