package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * 删除图书
 */

public class DelOperation implements IOperation{

    public void work(BookList bookList) {
        System.out.println("删除图书");

        System.out.println("请输入删除书的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int i = 0;
        int pos = -1;
        for(; i < bookList.getUserSize(); i++) {

            Book book = bookList.getBooks(i);

            if(book.getName().equals(name)) {
                System.out.println("找到了这本书！");

                pos = i;//记录当前书籍下标
                break;
            }
        }

        //2种情况 1.循环条结束退出  2.查找到了
        if(i >= bookList.getUserSize()) {
            System.out.println("查无此书");
            return;
        }

        int curSize = bookList.getUserSize();
        for(int j = pos; j < bookList.getUserSize()-1;j++) {

            Book  book = bookList.getBooks(i+1);//获取i+1位置图书
            bookList.setBooks(i,book);//把i+1 上的book放到i位置

            //或
            //bookList.setBooks(i,bookList.getBooks(i+1));
        }
        bookList.setUserSize(curSize - 1);
        System.out.println("删除成功");

    }
}
