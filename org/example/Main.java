/*Copyright (c) 2024   SNUT 兀朝阳202214024085  All rights reserved*/
package org.example;

import java.util.Scanner;

public class Main {
    private static final int MAX_MEMBER = 10000;


    public static void main(String[] args) {
        SavingAccount[] savingmember = new SavingAccount[MAX_MEMBER];
        int savingflag = 0;
        CreditAccount[] creditmember = new CreditAccount[MAX_MEMBER];
        int creditflag = 0;
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean loggedIn = false;
        int nowloggedIndigit = 0;
        int nowloggedIntype = 0;

        do {
            System.out.println("1. 开户");
            System.out.println("2. 登录");
            System.out.println("3. 退出");
            System.out.println("请选择您的操作: ");
            choice = sc.nextInt();
            sc.nextLine(); // 消耗换行符
            switch (choice) {
                case 1:
                    NewAccount newuser = new NewAccount();
                    int flagnewuser = newuser.enroll();
                    if (flagnewuser == 1 || flagnewuser == 2) {
                        System.out.println("开户成功");
                    }
                    switch (flagnewuser) {
                        case 1:
                            savingmember[savingflag] = newuser.getsavingaccount();
                            savingflag++;
                            break;
                        case 2:
                            creditmember[creditflag] = newuser.getcreditAccount();
                            creditflag++;
                            break;
                        default:
                            break;
                    }
                    ;
                    break;
                case 2:
                    login userlogin = new login();
                    int flagtype;
                    System.out.println("请选择账户类型:");
                    System.out.println("1.储蓄账户（SavingAccount）");
                    System.out.println("2.信用账户（CreditAccount）");
                    flagtype = sc.nextInt();
                    do {
                        switch (flagtype) {
                            case 1:
                                nowloggedIndigit = userlogin.Savingtologin(savingmember, savingflag);
                                nowloggedIntype = 1;
                                loggedIn = true;
                                break;
                            case 2:
                                nowloggedIndigit = userlogin.Credittologin(creditmember, creditflag);
                                nowloggedIntype = 2;
                                loggedIn = true;
                                break;
                            default:
                                System.out.println("请输入合法选项!");
                        }
                    } while ((flagtype != 1) && (flagtype != 2));
                    if (loggedIn) {
                        System.out.println("登录成功！");
                    } else {
                        System.out.println("登录失败，请检查用户名和密码。");
                    }
                    break;
                case 3:
                    System.out.println("退出成功!");
                    break;
                default:
                    System.out.println("请输入合法选项.");
            }


            if (loggedIn) {
                int flag;
                if (nowloggedIntype == 1) {
                    SavingAccount nowuser = new SavingAccount(savingmember[nowloggedIndigit].account,
                            savingmember[nowloggedIndigit].password, savingmember[nowloggedIndigit].username,
                            savingmember[nowloggedIndigit].id);
                    do {
                        System.out.println("1. 存款");
                        System.out.println("2. 取款");
                        System.out.println("3. 余额查询");
                        System.out.println("4. 退出");
                        System.out.println("请选择您的操作: ");
                        flag = sc.nextInt();
                        sc.nextLine(); // 消耗换行符

                        switch (flag) {
                            case 1:
                                System.out.println("请输入存款金额 ");
                                double amount1 = sc.nextDouble();
                                savingmember[nowloggedIndigit].balance = nowuser.deposit(amount1);
                                break;
                            case 2:
                                System.out.println("请输入取出金额 ");
                                double amount2 = sc.nextDouble();
                                savingmember[nowloggedIndigit].balance = nowuser.withdraw(amount2);
                                break;
                            case 3:
                                System.out.println(String.format("%.2f", savingmember[nowloggedIndigit].balance));
                                break;
                            case 4:
                                System.out.println("退出登录成功!");
                                break;
                            default:
                                System.out.println("请输入合法选项.");
                                break;
                        }

                    } while (flag != 4);
                } else if (nowloggedIntype == 2) {
                    CreditAccount nowuser = new CreditAccount(creditmember[nowloggedIndigit].account,
                            creditmember[nowloggedIndigit].password,creditmember[nowloggedIndigit].username,
                            creditmember[nowloggedIndigit].id);
                    do {
                        System.out.println("1. 存款");
                        System.out.println("2. 取款");
                        System.out.println("3. 余额查询");
                        System.out.println("4. 退出");
                        System.out.println("请选择您的操作: ");
                        flag = sc.nextInt();
                        sc.nextLine(); // 消耗换行符

                        switch (flag) {
                            case 1:
                                System.out.println("请输入存款金额 ");
                                double amount1 = sc.nextDouble();
                                creditmember[nowloggedIndigit].balance = nowuser.deposit(amount1);
                                break;
                            case 2:
                                System.out.println("请输入取出金额 ");
                                double amount2 = sc.nextDouble();
                                creditmember[nowloggedIndigit].balance = nowuser.withdraw(amount2);
                                break;
                            case 3:
                                System.out.println(String.format("%.2f", creditmember[nowloggedIndigit].balance));
                                break;
                            case 4:
                                System.out.println("退出登录成功!");
                                break;
                            default:
                                System.out.println("请输入合法选项.");
                                break;
                        }

                    } while (flag != 4);
                }


            }


        } while (choice != 3);

    }
}
