package me.qingy.oop.ddd.normal;

import me.qingy.oop.ddd.common.entity.Status;
import me.qingy.oop.ddd.common.entity.VirtualWalletTransactionEntity;
import me.qingy.oop.ddd.common.exception.InsufficientBalanceException;
import me.qingy.oop.ddd.common.entity.VirtualWalletBo;
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

    public VirtualWalletBo getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWalletBo walletBo = convert(walletEntity);
        return walletBo;
    }

    public BigDecimal getBalance(Long walletId) {
        return walletRepo.getBalance(walletId);
    }

    public void debit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        if (balance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException();
        }
        walletRepo.updateBalance(walletId, balance.subtract(amount));
    }

    public void credit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        BigDecimal balance = walletEntity.getBalance();
        walletRepo.updateBalance(walletId, balance.add(amount));
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) throws Exception {
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setFromWalletId(fromWalletId);
        transactionEntity.setToWalletId(toWalletId);
        transactionEntity.setStatus(Status.TO_BE_EXECUTED);

        Long transactionId = transactionRepo.saveTransaction(transactionEntity);
        try {
            debit(fromWalletId, amount);
            credit(toWalletId, amount);
        } catch (InsufficientBalanceException e) {
            transactionRepo.updateStatus(transactionId, Status.CLOSED);
            throw e;
        } catch (Exception e) {
            transactionRepo.updateStatus(transactionId, Status.FAILED);
            throw e;
        }
        transactionRepo.updateStatus(transactionId, Status.EXECUTED);
    }

    private VirtualWalletBo convert(VirtualWalletEntity walletEntity) {
        return new VirtualWalletBo();
    }
}

