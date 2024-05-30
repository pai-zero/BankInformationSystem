package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean loggedIn = false;

        do {
            System.out.println("1. 开户");
            System.out.println("2. 登录");
            System.out.println("1. 退出");
            System.out.println("请选择您的操作: ");
            choice = sc.nextInt();
            sc.nextLine(); // 消耗换行符
            switch (choice) {
                case 1:
                    NewAccount newuser = new NewAccount();
                    if(newuser.enroll())
                    {
                        System.out.println("开户成功");
                    };
                    break;
                case 2:
                    if (loggedIn) {
                        System.out.println("登录成功！");
                    } else {
                        System.out.println("登录失败，请检查用户名和密码。");
                    }

                    break;
                case 3:
                    System.out.println("退出成功!");
                default:
                    System.out.println("请输入合法选项.");

            }


            if (loggedIn) {
                int flag;
                do {

                } while ();
            }


        } while (choice != 3);

    }
}
