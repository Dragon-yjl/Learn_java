package operation;

import book.BookList;

/**
 * 退出系统操作
 */

public class ExitOperation implements IOperation{

    public void work(BookList bookList) {

        System.out.println("退出系统");
        System.exit(0);
    }
}
