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
@Document(collection = "checking_accounts")
@ToString
public class Checking {

    @Id
    private String id;
    private String accountHolder;
    private double balance;
    private double insufficientFundFee;

    public Checking() {}

    public Checking(String id, String accountHolder, double balance, double insufficientFundFee) {
        this.id = id;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.insufficientFundFee = insufficientFundFee;
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

    public double getInsufficientFundFee() {
        return insufficientFundFee;
    }

    public void setInsufficientFundFee(double insufficientFundFee) {
        this.insufficientFundFee = insufficientFundFee;
    }

    @Override
    public String toString() {
        return "Checking(" + this.id + ", " + this.accountHolder + ", " + this.balance + ", " + this.insufficientFundFee + ")";
    }
}