package com.exercises.streams.tutorial;

import com.exercises.data.Accounts;
import com.exercises.model.Account;

import java.util.ArrayList;
import java.util.List;

public class StreamSideEffectFilteringExample {
    public static void main(String[] args) {
        List<Account> accounts = Accounts.generateAccountList(10);

        List<Account> gmailAccounts = new ArrayList<>();

        accounts.stream()
                .filter(a -> a.getEmail().endsWith("@gmail.com"))
                .forEach(gmailAccounts::add);
    }
}
