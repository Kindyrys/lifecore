package com.kindyrys.lifecore.finance;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import java.math.BigDecimal;

@Service
public class FinanceService {

    private final TransactionRepository transactionRepository;

    public FinanceService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll
                (Sort.by(Sort.Direction.DESC, "transactionDate")
                     .and(Sort.by(Sort.Direction.DESC, "id"))
        );
    }

    public void saveTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    public void deleteTransactionById(Long id) {
        transactionRepository.deleteById(id);
    }

    public BigDecimal calculateTotalIncome() {
        BigDecimal total = BigDecimal.ZERO;
        for (Transaction transaction : getAllTransactions()) {
            if (transaction.getType() == TransactionType.INCOME) {
                total = total.add(transaction.getAmount());
            }
        }
        return total;
    }

    public BigDecimal calculateTotalExpenses() {
        BigDecimal total = BigDecimal.ZERO;
        for (Transaction transaction : getAllTransactions()) {
            if (transaction.getType() == TransactionType.EXPENSE) {
                total = total.add(transaction.getAmount());
            }
        }
        return total;
    }

    public BigDecimal calculateBalance() {
        BigDecimal income = calculateTotalIncome();
        BigDecimal expenses = calculateTotalExpenses();
        return income.subtract(expenses);
    }
}
