package org.example;

public class CreditAccount extends Account {
    private static final double MAX_OVERDRAW = 10000.0;

    public CreditAccount(String account, int password, String username, String id) {
        super(account, password, username, id);
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        }
        return 0.0;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0) {
            double newBalance = balance - amount;
            if (newBalance >= -MAX_OVERDRAW) { // 允许透支到-10000
                balance = newBalance;
                return balance;
            }
        }
        return 0.0;
    }
}