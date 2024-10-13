package com.hungh2002.budget_backend.services.budgetServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hungh2002.budget_backend.dto.DataAggregationDTO;
import com.hungh2002.budget_backend.services.budgetServices.dataAggregationServices.DataAggregationService;

@Service
public class BudgetServiceImp implements BudgetService {
    @Autowired
    private DataAggregationService dataAggregationService;

    public DataAggregationDTO getAll(Long userId) {
        DataAggregationDTO dataAggregationDTO = new DataAggregationDTO();
        dataAggregationDTO.setAllTime(dataAggregationService.getAllTime(userId));

        return dataAggregationDTO;
    }
}
