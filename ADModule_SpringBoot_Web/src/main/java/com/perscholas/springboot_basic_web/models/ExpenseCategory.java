package com.perscholas.springboot_basic_web.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expense_categories")
public class ExpenseCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "expense_category_id")
	private Integer expenseCategoryId;
	@Column(name = "expense_category_name")
	private String expenseCategoryName;
	@Column(name = "expense_category_description")
	private String expenseCategoryDescription;
	
	public ExpenseCategory() {}

	public ExpenseCategory(String expenseCategoryName, String expenseCategoryDescription) {
		this.expenseCategoryName = expenseCategoryName;
		this.expenseCategoryDescription = expenseCategoryDescription;
	}
	
	public ExpenseCategory(Integer expenseCategoryId, String expenseCategoryName, String expenseCategoryDescription) {
		this.expenseCategoryId = expenseCategoryId;
		this.expenseCategoryName = expenseCategoryName;
		this.expenseCategoryDescription = expenseCategoryDescription;
	}

	public Integer getExpenseCategoryId() {
		return expenseCategoryId;
	}

	public void setExpenseCategoryId(Integer expenseCategoryId) {
		this.expenseCategoryId = expenseCategoryId;
	}

	public String getExpenseCategoryName() {
		return expenseCategoryName;
	}

	public void setExpenseCategoryName(String expenseName) {
		this.expenseCategoryName = expenseName;
	}

	public String getExpenseCategoryDescription() {
		return expenseCategoryDescription;
	}

	public void setExpenseCategoryDescription(String expenseDescription) {
		this.expenseCategoryDescription = expenseDescription;
	}
	
}
