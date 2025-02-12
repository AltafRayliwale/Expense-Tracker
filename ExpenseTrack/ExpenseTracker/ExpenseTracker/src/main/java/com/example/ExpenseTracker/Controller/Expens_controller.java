package com.example.ExpenseTracker.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ExpenseTracker.Model.Expenses_table;
import com.example.ExpenseTracker.Service.Expenses_service;

@RestController
@RequestMapping("/api/expenses")
public class Expens_controller {

    @Autowired
    private Expenses_service service;

    @GetMapping
    public List<Expenses_table> getAllExpenses() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Expenses_table> getExpensesById(@PathVariable Long id) {
        Expenses_table expense = service.getById(id);
        return ResponseEntity.ok(expense);
    }

    @PostMapping
    public Expenses_table createExpense(@RequestBody Expenses_table expense) {
        return service.create(expense);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateExpense(@PathVariable Long id, @RequestBody Expenses_table expense) {
        service.update(id, expense);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
