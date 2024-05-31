package org.example;

import java.util.Scanner;

public class login {
    Scanner sc = new Scanner(System.in);

    public login() {
    }

    public int Savingtologin(SavingAccount[] savingmember, int savingflag) {
        System.out.println("请输入用户名: ");
        String account = sc.next();
        System.out.println("请输入密码: ");
        int password = sc.nextInt();


        for (int i = 0; i < savingflag; i++) {
            if (account.equals(savingmember[i].account)) {
                int j = 0;
                do {
                    if (password == savingmember[i].password) {
                        return i;
                    } else {
                        System.out.println("请重新输入密码: ");
                        System.out.println("还有" + (3 - j) + "次机会!");
                        j++;
                    }
                } while (j < 3);
            }
        }

        return 0;
    }

    public int Credittologin(CreditAccount[] creditmember, int creditflag){
        System.out.println("请输入用户名: ");
        String account = sc.next();
        System.out.println("请输入密码: ");
        int password = sc.nextInt();


        for (int i = 0; i < creditflag; i++) {
            if (account.equals(creditmember[i].account)) {
                int j = 0;
                do {
                    if (password == creditmember[i].password) {
                        return i;
                    } else {
                        System.out.println("请重新输入密码: ");
                        System.out.println("还有" + (3 - j) + "次机会!");
                        j++;
                    }
                } while (j < 3);
            }
        }

        return 0;
    }
}