package com.example.ExpenseTracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ExpenseTracker.Model.Expenses_table;

@Repository
public interface Expenses_repository extends JpaRepository<Expenses_table, Long> {

}
