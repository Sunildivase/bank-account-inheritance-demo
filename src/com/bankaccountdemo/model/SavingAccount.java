package com.bankaccountdemo.model;

public class SavingAccount extends Account {
  double interestRate;
  int balance;

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", balance=" + balance +
                ", accountId=" + accountId +
                ", accHolderName='" + accHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
