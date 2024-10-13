package com.hungh2002.budget_backend.services.budgetServices.dataAggregationServices;

import java.util.Map;
import com.hungh2002.budget_backend.dto.BudgetDTO;

public interface DataAggregationService {
    public Map<String, BudgetDTO> getAllTime(Long userId);
}
