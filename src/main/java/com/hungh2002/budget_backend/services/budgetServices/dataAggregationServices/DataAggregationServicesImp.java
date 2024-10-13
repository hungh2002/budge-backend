package com.hungh2002.budget_backend.services.budgetServices.dataAggregationServices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import com.hungh2002.budget_backend.dto.BudgetDTO;
import com.hungh2002.budget_backend.dto.ExpenseDTO;
import com.hungh2002.budget_backend.dto.IncomeDTO;
import com.hungh2002.budget_backend.entity.Expense;
import com.hungh2002.budget_backend.entity.Income;
import com.hungh2002.budget_backend.repository.ExpenseRepository;
import com.hungh2002.budget_backend.repository.IncomeRepository;

public class DataAggregationServicesImp implements DataAggregationService {
    @Autowired
    IncomeRepository incomeRepository;
    @Autowired
    ExpenseRepository expenseRepository;

    public Map<String, BudgetDTO> getAllTime(Long userId) {
        Map<String, BudgetDTO> DataAggregation = new HashMap<>();
        BudgetDTO budgetDTO = new BudgetDTO();

        budgetDTO.setIncomes(incomeRepository.findByUserId(userId));
        budgetDTO.setExpenses(expenseRepository.findByUserId(userId));

        DataAggregation.put("allTime", budgetDTO);

        return DataAggregation;
    }

    public Map<String, BudgetDTO> getYear(Long userId) {
        Map<String, BudgetDTO> DataAggregation = new HashMap<>();
        BudgetDTO budgetDTO = new BudgetDTO();

        budgetDTO.setIncomes(incomeRepository.findByUserId(userId));
        budgetDTO.setExpenses(expenseRepository.findByUserId(userId));

        DataAggregation.put("allTime", budgetDTO);

        return DataAggregation;
    }
}
