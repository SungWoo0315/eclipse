package chapter_07;

public class p207_Book {

    private String bookName;
    private String author;
    
    public p207_Book() {}           // 디폴트 생성자.
    
    
    public p207_Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void showBookInfo() {
        System.out.println(bookName + " , " + author);
    }
}
