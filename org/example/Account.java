package org.example;

public abstract class Account {
    protected String account;
    protected int password;
    protected String username;
    protected String id;
    protected double balance = 0.0;//账户金额

    public Account(String account, int password, String username, String id) {
        this.account = account;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public String getAccount() {
        return account;
    }
    public int getPassword(){
        return password;
    }
    public String getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public double getBalance() {
        return balance;
    }

    // 抽象方法，子类需要实现
    public abstract double deposit(double amount);

    // 抽象方法，子类需要实现
    public abstract double withdraw(double amount);
}