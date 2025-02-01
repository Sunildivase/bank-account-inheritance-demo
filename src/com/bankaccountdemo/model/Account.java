package com.bankaccountdemo.model;

public class Account {

     int accountId;
     String accHolderName;
     int accountNumber;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accHolderName='" + accHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNo() {
        return accountNumber;
    }
}
