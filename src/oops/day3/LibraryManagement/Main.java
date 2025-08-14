package OOPsDay3.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Samskara", "U. R. Ananthamurthy");
        Book b2 = new Book("Bhava", "S.L. Bhyrappa");
        Book b3 = new Book("Malegalalli", "Kuvempu");
        BookManagement b=new BookManagement();
        b.addBook(b1);
        b.addBook(b2);
        b.addBook(b3);
        b.displayBooks();
        b.issueBook("Samskara");
        b.displayBooks();
        b.returnBook("Samskara");
        b.displayBooks();

    }
}
