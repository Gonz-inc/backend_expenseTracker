package com.expenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.expenseTracker.entity.Transaction;
import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDate;

// Transaction Repository for the Transaction entity. 
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	// lists of methods for find queries based on fields.
	List<Transaction> findByDescr(String descr);
	List<Transaction> findByAmountGreaterThan(BigDecimal amount);
	List<Transaction> findByDate(LocalDate date);
	
}
