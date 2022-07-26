package com.digitalWallet.entity;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

@Getter
@Setter
public class Account {

    private int accountNumber;
    private User user;
    private BigDecimal balance;
    private Set<Transaction> transactions;
    Random random = new Random();

    public Account(String name, BigDecimal amount) {
        //this.accountNumber = AccountNumberGenerator.getNextAccountNumber();
        this.accountNumber = random.nextInt(10000);
        this.user = new User(name);
        this.balance = amount;
        this.transactions = new TreeSet<>((a, b) -> a.getDate().compareTo(b.getDate()));
    }

}
