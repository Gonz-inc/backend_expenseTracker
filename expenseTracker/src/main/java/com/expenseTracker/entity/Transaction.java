package com.expenseTracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name= "expenses")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descr", nullable = false, length = 255)
	private String descr;
	
	@Column(name = "amount", nullable = false)
	private BigDecimal amount;
	
	@Column(name = "date", nullable = false)
	private LocalDate date;
	
	public Transaction() {}
	
	public Transaction(String descr, BigDecimal amount, LocalDate date) {
		this.descr = descr;
		this.amount = amount;
		this.date = date;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getDescr() {
		return descr;
	}
	
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override 
	public String toString() {
		return "Transaction{" + "id=" 
				+ id +
				", description=' " +
				descr + '\'' + 
				", amount= " + amount 
				+ ", date= " + date +
				'}';
	}
}