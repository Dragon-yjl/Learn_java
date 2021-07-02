package operation;

import book.Book;
import book.BookList;

/**
 * 显示图书
 */

public class DisplayOperation implements IOperation{

    public void work(BookList bookList) {
        System.out.println("显示图书");

        for(int i = 0; i < bookList.getUserSize();i++) {
            System.out.println(bookList.getBooks(i));
            //或
//            Book book = new bookList.getBooks(i);
//            System.out.println(book);
        }
    }
}
