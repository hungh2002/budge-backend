package com.hungh2002.budget_backend.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IncomeDTO {
    private Long id;

    private String name;

    private Double amount;

    private String category;

    private Long userId;

    private LocalDate createdAt;

    private LocalDate updatedAt;
}
