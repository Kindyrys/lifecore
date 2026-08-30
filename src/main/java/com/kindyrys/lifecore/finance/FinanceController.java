package com.kindyrys.lifecore.finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FinanceController {

    private final FinanceService financeService;

    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/finance/transactions")
    public String showTransactionsPage() {
        return "finance/transactions";
    }
}
