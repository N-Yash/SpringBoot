package com.example.demo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@Document(collection = "savings_accounts")
@ToString
public class Savings {

    @Id
    private String id;
    private String accountHolder;
    private double balance;
    private double interestRate;

    public Savings() {}

    public Savings(String id, String accountHolder, double balance, double interestRate) {
        this.id = id;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Savings(" + this.id + ", " + this.accountHolder + ", " + this.balance + ", " + this.interestRate + ")";
    }
}