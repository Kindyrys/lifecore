package com.kindyrys.lifecore.finance;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;

@Controller
public class FinanceController {

    private final FinanceService financeService;

    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/finance/transactions")
    public String showTransactionsPage(Model model) {
        model.addAttribute("transactions", financeService.getAllTransactions());
        model.addAttribute("transaction", new Transaction());
        model.addAttribute("totalIncome", financeService.calculateTotalIncome());
        model.addAttribute("totalExpenses", financeService.calculateTotalExpenses());
        model.addAttribute("balance", financeService.calculateBalance());
        return "finance/transactions";
    }

    @PostMapping("/finance/transactions")
    public String addTransaction(@Valid @ModelAttribute Transaction transaction,
                                 BindingResult bindingResult,
                                 Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("transactions", financeService.getAllTransactions());
            model.addAttribute("totalIncome", financeService.calculateTotalIncome());
            model.addAttribute("totalExpenses", financeService.calculateTotalExpenses());
            model.addAttribute("balance", financeService.calculateBalance());
            return "finance/transactions";
        }
        financeService.saveTransaction(transaction);
        return "redirect:/finance/transactions";
    }

    @PostMapping("/finance/transactions/{id}/delete")
    public String deleteTransaction(@PathVariable Long id) {
        financeService.deleteTransactionById(id);
        return "redirect:/finance/transactions";
    }
}
