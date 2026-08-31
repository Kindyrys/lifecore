package com.kindyrys.lifecore.finance;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class FinanceController {

    private final FinanceService financeService;

    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/finance/transactions")
    public String showTransactionsPage(Model model) {
        model.addAttribute("transactions", financeService.getAllTransactions());
        return "finance/transactions";
    }
}
