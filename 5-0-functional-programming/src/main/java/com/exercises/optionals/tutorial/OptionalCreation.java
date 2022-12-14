package com.exercises.optionals.tutorial;

import com.exercises.data.Accounts;
import com.exercises.model.Account;

import java.util.Optional;

public class OptionalCreation {
    public static void main(String[] args) {
        Account account = Accounts.generateAccount();

        Optional<Account> optionalAccount = Optional.of(account);

        Optional<Account> optionalNullableAccount = Optional.ofNullable(account);

        Optional<Account> optionalEmptyAccount = Optional.empty();
    }
}
