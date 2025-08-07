package OOPsProblemsDay4.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Book book1=new Fiction("101","xyz");
        book1.addBook(book1);
        book1.issueBook("xyz");
        System.out.println(book1.issueBook("xyz"));
    }
}

