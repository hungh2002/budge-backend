package com.hungh2002.budget_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hungh2002.budget_backend.dto.DataAggregationDTO;
import com.hungh2002.budget_backend.services.budgetServices.BudgetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class BudgetController {

    @Autowired
    private BudgetService budgetServices;

    @GetMapping("/all")
    public ResponseEntity<DataAggregationDTO> getAll(@RequestParam Long userId) {
        return ResponseEntity.ok(budgetServices.getAll(userId));
    }

}
