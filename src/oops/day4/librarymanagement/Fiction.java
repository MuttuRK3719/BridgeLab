package OOPsProblemsDay4.LibraryManagement;

public class Fiction extends Book {
    private Book[] fictionbooks = new Fiction[20];
    private int bookNumber;

    Fiction(String bookId, String bookName) {
        setBookId(bookId);
        setBookName(bookName);
    }

    @Override
    void addBook(Book b) {
        fictionbooks[bookNumber++] = b;
    }

    @Override
    public void availabilityOfBook(String name) {
        System.out.println("Book is available in library u can take ");
    }

    @Override
    public boolean issueBook(String name) {
        for (int i = 0; i < bookNumber; i++) {
            if (fictionbooks[i].equals(name)) {
                return !fictionbooks[i].isAvailable();
            }
        }
        System.out.println("sorry not possible to essue book ");
        return false;
    }

    @Override
    public boolean returnBook(String name) {
        for (int i = 0; i < bookNumber; i++) {
            if (fictionbooks[i].equals(name)) {
                fictionbooks[i].setAvailable(false);
                System.out.println("The book is returned successfully ");
                return true;
            }
        }
        return false;
    }
}
