package com.perscholas.springboot_basic_web.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perscholas.springboot_basic_web.models.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
	
}
