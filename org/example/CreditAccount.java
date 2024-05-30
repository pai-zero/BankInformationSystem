package org.example;

public class CreditAccount extends Account {
    private static final double MAX_OVERDRAW = 10000.0;

    public CreditAccount(String account, int password, String username, String id) {
        super(account, password, username, id);
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0) {
            double newBalance = balance - amount;
            if (newBalance >= -MAX_OVERDRAW) { // 允许透支到-10000
                balance = newBalance;
                return true;
            }
        }
        return false;
    }
}