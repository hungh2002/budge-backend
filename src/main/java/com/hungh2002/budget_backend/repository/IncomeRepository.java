package com.hungh2002.budget_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hungh2002.budget_backend.entity.Income;
import java.util.List;



public interface IncomeRepository extends JpaRepository<Income, Long> {
    List<Income> findByUserId(Long userId);

    List<Income> findByUpdatedAtBetween
}
