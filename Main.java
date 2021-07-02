import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //准备了三本书籍
        //1.准备基本数据
        BookList bookList = new BookList();

        //2.创建用户
        User user = login();//向上转型

        //3.进入主循环
        while (true) {

            int choice = user.menu();//动态绑定
            user.doOperation(choice,bookList);
        }
    }

    public static User login() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = scanner.next();
        System.out.println("请输入你的身份： 1-》 管理员 0:-》普通用户");
        int n = scanner.nextInt();

        if(n == 1) {

            return new AdminUser(name);
        }else {

            return new NormalUser(name);

        }

    }


}
