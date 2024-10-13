package com.hungh2002.budget_backend.services.budgetServices;

import com.hungh2002.budget_backend.dto.DataAggregationDTO;

public interface BudgetService {
    public DataAggregationDTO getAll(Long userId);
}
