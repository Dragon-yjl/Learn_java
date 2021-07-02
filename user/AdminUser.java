package user;

import operation.*;

import java.util.Scanner;

/**
 * 管理员用户
 */

public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);

        this.iOperations = new IOperation[] {
                new ExitOperation(),//对应0号下标,退出系统
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()

        };

    }

    public int menu() {

        System.out.println("=============================");
        System.out.println("Hello " + this.name + ", 欢迎使用图书管理系统!");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示所有图书");
        System.out.println("0. 退出系统");
        System.out.println("=============================");
        System.out.println("请输入您的选择: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        return choice;

    }
}
