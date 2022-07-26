package com.digitalWallet.dao;

import com.digitalWallet.entity.Account;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter @Getter
public class WalletDao {
    private Map<Integer, Account> accountMap;
    public WalletDao(){
        this.accountMap = new HashMap<>();
    }
}
