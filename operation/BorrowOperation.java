package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 *  借阅书籍
 */

public class BorrowOperation implements IOperation{

    public void work(BookList bookList) {
        System.out.println("借阅书籍");

        System.out.println("请输入借阅书的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for(int i = 0; i < bookList.getUserSize(); i++) {

            Book book = bookList.getBooks(i);

            if(book.getName().equals(name)) {
                System.out.println("找到了这本书！");
                book.setBorrowed(true);//借阅书籍
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("查无此书");
    }
}
