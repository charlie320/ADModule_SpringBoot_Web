package com.perscholas.springboot_basic_web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.springboot_basic_web.models.Expense;
import com.perscholas.springboot_basic_web.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	public Integer createExpense(Expense expense) {
		Expense newExpense = expenseRepository.save(expense);
		return newExpense.getExpenseId();
	}
		
	public List<Expense> findAll() {
		List<Expense> allExpenses = expenseRepository.findAll();
		return allExpenses;
	}

}
