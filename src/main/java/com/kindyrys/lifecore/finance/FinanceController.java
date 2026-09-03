package com.kindyrys.lifecore.finance;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/finance/transactions")
    public String addTransaction(@ModelAttribute Transaction transaction) {
        financeService.saveTransaction(transaction);
        return "redirect:/finance/transactions";
    }
}
