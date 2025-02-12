package com.example.ExpenseTracker.Model;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
public class Expenses_table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Category_Of_Expenses")
    private String cat;

    @Column(name = "Expenses_Name")
    private String exp;

    @Column(name = "Amount")
    private Double amt;

    @CreationTimestamp
    @Column(name = "Date_of_Adding", nullable = false)
    private LocalDateTime doa;

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public LocalDateTime getDoa() {
        return doa;
    }

    public void setDoa(LocalDateTime doa) {
        this.doa = doa;
    }
}
