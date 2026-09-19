package com.kindyrys.lifecore.finance;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
