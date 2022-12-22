package com.user.loan_Management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.loan_Management.model.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
	
	LoanApplication findByPanNo(String panNo);
	
	List<LoanApplication> findAllByApplicationStatus(String applicationStatus);
	

}
