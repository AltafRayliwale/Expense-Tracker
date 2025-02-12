package com.example.ExpenseTracker.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ExpenseTracker.Model.Expenses_table;
import com.example.ExpenseTracker.Repository.Expenses_repository;

@Service
public class Expenses_service {

    @Autowired
    private Expenses_repository rp;

    public List<Expenses_table> getAll() {
        return rp.findAll();
    }

    public Expenses_table getById(Long id) {
        return rp.findById(id).get();
    }

    public Expenses_table create(Expenses_table exp) {
        return rp.save(exp);
    }

    public void update(Long id, Expenses_table exp) {
        Expenses_table curTask = getById(id);
        curTask.setCat(exp.getCat());
        curTask.setExp(exp.getExp());
        curTask.setAmt(exp.getAmt());
        curTask.setDoa(exp.getDoa());
        rp.save(curTask);
    }

    public void delete(Long id) {
        Expenses_table curTask = getById(id);
        rp.delete(curTask);
    }
}
