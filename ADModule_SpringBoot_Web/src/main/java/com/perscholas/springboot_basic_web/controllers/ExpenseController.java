package com.perscholas.springboot_basic_web.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.perscholas.springboot_basic_web.models.Expense;
import com.perscholas.springboot_basic_web.models.ExpenseCategory;
import com.perscholas.springboot_basic_web.services.ExpenseCategoryService;
import com.perscholas.springboot_basic_web.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	@Autowired
	ExpenseCategoryService expenseCategoryService;
	
	@GetMapping("/expenseForm")
	public String showExpenseForm(Model model) {
		List<ExpenseCategory> expenseCategories = expenseCategoryService.findAll();
		model.addAttribute("newExpense", new Expense());
		model.addAttribute("expenseCategories", expenseCategories);
		return "ExpenseForm";
	}
	
	@PostMapping("/createExpense")
	public String createExpense(@Valid @ModelAttribute("newExpense") Expense newExpense, 
			BindingResult result) {
		expenseService.createExpense(newExpense);
		return "redirect:/expenseForm";
	}
	
	@GetMapping("/allExpenses")
	public String allExpenses(Model model) {
		List<Expense> allExpenses = expenseService.findAll();
		model.addAttribute("allExpenses", allExpenses);
		return "ExpenseReport";
	}
}
