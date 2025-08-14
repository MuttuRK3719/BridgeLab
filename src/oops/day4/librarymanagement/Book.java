package OOPsProblemsDay4.LibraryManagement;

public abstract class Book {
    private String bookName;
    private String bookId;
    private boolean available;

    public String getBookName() {
        return bookName;
    }

    abstract void addBook(Book b);

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    abstract void availabilityOfBook(String name);

    abstract boolean issueBook(String name);

    abstract boolean returnBook(String name);
}
