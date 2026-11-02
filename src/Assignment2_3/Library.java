
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");

        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". Title: "
                    + books.get(i).getTitle()
                    + ", Author: " + books.get(i).getAuthor()
                    + ", Year: " + books.get(i).getYear());
        }
    }

    public void findBooksByAuthor(String author) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getAuthor().equals(author)) {
                System.out.println("Title: "
                        + books.get(i).getTitle()
                        + ", Year: " + books.get(i).getYear());
            }
        }
    }

    public void borrowBook(String title) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                System.out.println(title + " has been borrowed.");
                return;
            }
        }

        System.out.println(title + " is not available.");
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been returned.");
    }

    public boolean isBookAvailable(String title) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getTitle().equals(title)) {
                return true;
            }
        }

        return false;
    }

    public double getAverageBookRating() {

        if (books.size() == 0) {
            return 0;
        }

        double total = 0;

        for (int i = 0; i < books.size(); i++) {
            total = total + books.get(i).getRating();
        }

        return total / books.size();
    }

    public Book getMostReviewedBook() {

        if (books.size() == 0) {
            return null;
        }

        Book mostReviewed = books.get(0);

        for (int i = 1; i < books.size(); i++) {

            if (books.get(i).getNumberOfReviews()
                    > mostReviewed.getNumberOfReviews()) {
                mostReviewed = books.get(i);
            }
        }

        return mostReviewed;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User findUser(String name) {

        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getName().equals(name)) {
                return users.get(i);
            }
        }

        return null;
    }

    public void displayUsers() {

        System.out.println("Library Users:");

        for (int i = 0; i < users.size(); i++) {
            System.out.println("Name: " + users.get(i).getName()
                    + ", Age: " + users.get(i).getAge());
        }
    }

    public void borrowBook(User user, String title) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getTitle().equals(title)) {

                Book book = books.get(i);

                user.borrowBook(book);

                books.remove(i);

                System.out.println(user.getName()
                        + " borrowed " + title);

                return;
            }
        }

        System.out.println(title + " is not available.");
    }

    public void returnBook(User user, Book book) {

        user.returnBook(book);

        books.add(book);

        System.out.println(user.getName()
                + " returned " + book.getTitle());
    }
}

