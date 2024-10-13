package com.hungh2002.budget_backend.dto;


import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataAggregationDTO {
    private Map<String, BudgetDTO> allTime;
    private Map<String, BudgetDTO> year;
    private Map<String, BudgetDTO> month;
    private Map<String, BudgetDTO> week;
}
