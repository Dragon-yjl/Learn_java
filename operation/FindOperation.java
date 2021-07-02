package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * 查找图书
 */

public class FindOperation implements IOperation{
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("查找图书");
        System.out.println("请输入查找的图书的名字");

        String name;
        name = scanner.next();

        for(int i = 0; i < bookList.getUserSize(); i++) {

            Book book = bookList.getBooks(i);

            if(book.getName().equals(name)) {
                System.out.println("找到了这本书！");
                System.out.println(book);
                return;
            }
        }

        System.out.println("查无此书");
    }
}
