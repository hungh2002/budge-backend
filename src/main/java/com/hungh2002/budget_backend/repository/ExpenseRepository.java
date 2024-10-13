package com.hungh2002.budget_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hungh2002.budget_backend.entity.Expense;
import java.util.List;



public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUserId(Long userId);
}
