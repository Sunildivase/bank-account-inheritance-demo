package com.bankaccountdemo.repository;

import com.bankaccountdemo.model.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountRepository {

    Set<Account> accounts = new HashSet<>();

    public Account openAccount(Account account){
        accounts.add(account);
        return account;
    }

   public void closeAccount(Account account){
        accounts.remove(account);
   }

   public Set<Account> getAllAccounts(){
        return accounts;
   }

    public Account getAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNo() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
