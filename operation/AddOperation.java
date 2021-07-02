package operation;

import book.Book;
import book.BookList;

import java.awt.image.RescaleOp;
import java.util.Scanner;

/**
 * 添加图书
 */

public class AddOperation implements IOperation{

    public void work(BookList bookList) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("添加图书");

        //只需要放到当前顺序表的最后位置就好了

        System.out.println("请输入图书的名字");
        String name = scanner.next();
        System.out.println("请输入图书的作者");
        String author = scanner.next();
        System.out.println("请输入图书的价格");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);
        int currentSize = bookList.getUserSize();//3
        bookList.setBooks(currentSize,book);
        bookList.setUserSize(currentSize+1);//3+1

        System.out.println("添加成功！");

    }
}
