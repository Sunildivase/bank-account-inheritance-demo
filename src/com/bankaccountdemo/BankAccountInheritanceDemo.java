package com.bankaccountdemo;


import com.bankaccountdemo.model.Account;
import com.bankaccountdemo.repository.AccountRepository;
import com.bankaccountdemo.service.AccountService;

public class BankAccountInheritanceDemo {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        Account account = accountService.openAccount();

        System.out.println("account opened successfully: "+account);


        }
    }
