package com.perscholas.springboot_basic_web.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "expenses")
public class Expense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "expense_id")
	private Integer expenseId;
	@Column(name = "title")
	private String title;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date")
	private LocalDate date;
	@Column(name = "amount")
	private Double amount;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="expense_category_id")
	private ExpenseCategory expenseCategory;
	
	public Expense() {}

	public Expense(String title, LocalDate date, Double amount, ExpenseCategory expenseCategory) {
		this.title = title;
		this.date = date;
		this.amount = amount;
		this.expenseCategory = expenseCategory;
	}
	
	public Expense(Integer expenseId, String title, LocalDate date, Double amount, ExpenseCategory expenseCategory) {
		this.title = title;
		this.expenseId = expenseId;
		this.date = date;
		this.amount = amount;
		this.expenseCategory = expenseCategory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(Integer expenseId) {
		this.expenseId = expenseId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public ExpenseCategory getExpenseCategory() {
		return expenseCategory;
	}

	public void setExpenseCategory(ExpenseCategory expenseCategory) {
		this.expenseCategory = expenseCategory;
	}
}
