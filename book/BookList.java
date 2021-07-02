package book;


/**-
 * 图书顺序表
 */

public class BookList {

    private Book[] books = new Book[10];//10本书
    private int userSize = 0;

    public BookList() {
        books[0] = new Book("三国演义","罗贯中",12,"小说");
        books[1] = new Book("西游记","吴承恩",32,"小说");
        books[2] = new Book("水浒传","施耐庵",6,"小说");

        this.userSize = 3;
    }

    public void setBooks(int pos,Book book) {
        this.books[pos] = book;//在pos位置放上这本书
    }

    public Book getBooks(int pos) {
        return this.books[pos];//返回pos位置上的书
    }
//    跟我们需要的方法不匹配
//    public Book[] getBooks() {
//        return books;
//    }
//
//    public void setBooks(Book[] books) {
//        this.books = books;
//    }

    public int getUserSize() {
        return userSize;
    }

    public void setUserSize(int userSize) {
        this.userSize = userSize;
    }
}
