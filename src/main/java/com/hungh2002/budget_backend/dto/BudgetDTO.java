package com.hungh2002.budget_backend.dto;

import java.util.List;
import com.hungh2002.budget_backend.entity.Expense;
import com.hungh2002.budget_backend.entity.Income;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BudgetDTO {
    private List<Income> incomes;
    private List<Expense> expenses;
}
