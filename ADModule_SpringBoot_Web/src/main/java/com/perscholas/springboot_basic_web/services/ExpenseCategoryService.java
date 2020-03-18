package com.perscholas.springboot_basic_web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perscholas.springboot_basic_web.models.ExpenseCategory;
import com.perscholas.springboot_basic_web.repositories.ExpenseCategoryRepository;

@Service
public class ExpenseCategoryService {
	
	@Autowired
	ExpenseCategoryRepository expenseCategoryRepository;

	public List<ExpenseCategory> findAll() {
		List<ExpenseCategory> allCategories = expenseCategoryRepository.findAll();
		return allCategories;
	}

}