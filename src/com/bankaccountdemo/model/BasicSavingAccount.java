package com.bankaccountdemo.model;

public class BasicSavingAccount extends Account {
    boolean isZeroBalanceAccount;
    int withdrawalLimit;

    @Override
    public String toString() {
        return "BasicSavingAccount{" +
                "isZeroBalanceAccount=" + isZeroBalanceAccount +
                ", withdrawalLimit=" + withdrawalLimit +
                ", accountId=" + accountId +
                ", accHolderName='" + accHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public boolean isZeroBalanceAccount() {
        return isZeroBalanceAccount;
    }

    public void setZeroBalanceAccount(boolean zeroBalanceAccount) {
        isZeroBalanceAccount = zeroBalanceAccount;
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(int withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }
}
