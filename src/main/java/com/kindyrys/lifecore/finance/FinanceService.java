package com.kindyrys.lifecore.finance;

import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    private final TransactionRepository transactionRepository;

    public FinanceService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
}
