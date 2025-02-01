package com.bankaccountdemo.service;

import com.bankaccountdemo.model.Account;
import com.bankaccountdemo.repository.AccountRepository;

import java.util.Scanner;

public class AccountService {

   private static final Scanner scanner =new Scanner(System.in);

    private AccountRepository accountRepository = new AccountRepository();

    public Account openAccount(){

        System.out.println("please enter account id");
        int accountId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter account holder name");
        String accHolderName = scanner.nextLine();

        System.out.println("please enter account number");
        int accountNumber = Integer.parseInt(scanner.nextLine());

        Account account = new Account();
        account.setAccountId(accountId);
        account.setAccHolderName(accHolderName);
        account.setAccountNumber(accountNumber);
        return account;
    }

  public Account viewAccount(int accountNumber){
        return accountRepository.getAccount(accountNumber);
  }

}
