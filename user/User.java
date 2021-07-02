package user;

import book.Book;
import book.BookList;
import operation.IOperation;

abstract public class User {

    protected String name;
    protected IOperation[] iOperations;//存储当前对象，所对应下的所有的方法操作

    public User(String name) {
        this.name = name;
    }

    //显示菜单
    abstract public int menu();

    public void doOperation (int choice, BookList bookList) {

        this.iOperations[choice].work(bookList);
        //数组下标为choice 下标的这个对象
    }
}
