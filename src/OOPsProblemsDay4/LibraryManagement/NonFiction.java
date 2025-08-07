package OOPsProblemsDay4.LibraryManagement;

public class NonFiction extends Book{
    private Book[] NonFictionbooks = new Fiction[20];
    private int bookNumber;

    NonFiction(String bookId, String bookName) {
        setBookId(bookId);
        setBookName(bookName);
    }

    @Override
    void addBook(Book b) {
        NonFictionbooks[bookNumber++] = b;
    }

    @Override
    public void availabilityOfBook(String name) {
        System.out.println("Book is available in library u can take ");
    }

    @Override
    public boolean issueBook(String name) {
        for (int i = 0; i < bookNumber; i++) {
            if (NonFictionbooks[i].equals(name)) {
                return !NonFictionbooks[i].isAvailable();
            }
        }
        System.out.println("sorry not possible to essue book ");
        return false;
    }

    @Override
    public boolean returnBook(String name) {
        for (int i = 0; i < bookNumber; i++) {
            if (NonFictionbooks[i].equals(name)) {
                NonFictionbooks[i].setAvailable(false);
                System.out.println("The book is returned successfully ");
                return true;
            }
        }
        return false;
    }
}
