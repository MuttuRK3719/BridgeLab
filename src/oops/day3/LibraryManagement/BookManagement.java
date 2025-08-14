package OOPsDay3.LibraryManagement;

public class BookManagement {
    Book[] books = new Book[5];
    int index = 0;
    void addBook(Book b){
        books[index++]=b;
    }
    public void issueBook(String title) {
        for (int i = 0; i < index; i++) {
            if (books[i].getTitle().equals(title)) {
                if (!books[i].getStatus())
                    books[i].setStatus(true);
                else System.out.println("Book is barrowed someone");
            }
        }
    }

    public void returnBook(String title) {
        for (int i = 0; i < index; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i].setStatus(false);

            }
        }
    }
    public void displayBooks() {
        for (int i = 0; i < index; i++) {
            if (!books[i].getStatus()) {
                System.out.println(books[i]);
            }
        }
    }

}
