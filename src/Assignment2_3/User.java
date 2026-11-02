
import java.util.ArrayList;

public class User {

    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public void displayBorrowedBooks() {

        System.out.println("Books borrowed by " + name + ":");

        if (borrowedBooks.size() == 0) {
            System.out.println("No borrowed books.");
        }

        for (int i = 0; i < borrowedBooks.size(); i++) {
            System.out.println(borrowedBooks.get(i).getTitle());
        }
    }
}

