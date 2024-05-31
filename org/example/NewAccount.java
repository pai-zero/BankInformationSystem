package org.example;

import java.util.Scanner;

public class NewAccount {
    Scanner sc = new Scanner(System.in);
    String account;
    int password;
    String username;
    String id;// 身份信息
    public NewAccount() {
    }

    public int enroll() {

        int choice;

        boolean flag = false;

        System.out.println("请选择开户类型:");
        System.out.println("1.储蓄账户（SavingAccount）");
        System.out.println("2.信用账户（CreditAccount）");

        choice = sc.nextInt();
        sc.nextLine();

        do {
            if (choice == 1) {
                boolean flag1 = false;

                System.out.println("请输入账户名称(不多于十五个字符):");
                do {
                    account = sc.next();
                    if (account.length() > 15) {
                        flag1 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag1);
                System.out.println("请输入账户密码(六位密码):");
                do {
                    password = sc.nextInt();
                    int len = (password + "").length();
                    if (len != 6) {
                        flag1 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag1);
                System.out.println("请输入用户姓名(不多于十五个字符):");
                do {
                    username = sc.next();
                    if (username.length() > 15) {
                        flag1 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag1);
                System.out.println("请输入用户身份证号码(十八位身份证号)");
                do {
                    id = sc.next();
                    if (id.length() != 18) {
                        flag1 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag1);

                return 1;
            } else if (choice == 2) {
                boolean flag2 = false;

                System.out.println("请输入账户名称(不多于十五个字符):");
                do {
                    account = sc.next();
                    if (account.length() > 15) {
                        flag2 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag2);
                System.out.println("请输入账户密码(六位密码):");
                do {
                    password = sc.nextInt();
                    int len = (password + "").length();
                    if (len != 6) {
                        flag2 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag2);
                System.out.println("请输入用户姓名(不多于十五个字符):");
                do {
                    username = sc.next();
                    if (username.length() > 15) {
                        flag2 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag2);
                System.out.println("请输入用户身份证号码(十八位身份证号)");
                do {
                    id = sc.next();
                    if (id.length() != 18) {
                        flag2 = true;
                        System.out.println("请重新输入:");
                    }
                } while (flag2);


                return 2;
            } else {
                System.out.println("请输入合法范围.");
                flag = true;
            }
        } while (flag);

       return 0;

    }
    public SavingAccount getsavingaccount(){
        SavingAccount user = new SavingAccount(account, password, username, id);
        return user;
    }
    public CreditAccount getcreditAccount(){
        CreditAccount user = new CreditAccount(account, password, username, id);
        return user;
    }

}
