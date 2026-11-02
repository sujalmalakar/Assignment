
public class LibraryMain {

    public static void main(String[] args) {

        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        book1.setRating(4.5);
        book2.setRating(5.0);
        book3.setRating(3.5);

        book1.addReview("Very good book!");
        book1.addReview("Easy to understand.");
        book2.addReview("Very useful book.");

        library.displayBooks();

        System.out.println();

        library.borrowBook("Introduction to Java Programming");

        System.out.println();

        library.displayBooks();

        System.out.println();

        library.returnBook(book1);

        System.out.println();

        library.displayBooks();

        System.out.println();

        System.out.println("Books by Author Jane Doe:");

        library.findBooksByAuthor("Jane Doe");

        System.out.println();

        System.out.println("Average book rating: "
                + library.getAverageBookRating());

        Book mostReviewed = library.getMostReviewedBook();

        if (mostReviewed != null) {
            System.out.println("Most reviewed book: "
                    + mostReviewed.getTitle());
        }

        System.out.println();

        User user1 = new User("Michael", 22);
        User user2 = new User("Sarah", 25);

        library.addUser(user1);
        library.addUser(user2);

        library.displayUsers();

        System.out.println();

        library.borrowBook(user1, "Introduction to Java Programming");

        library.borrowBook(user2, "Data Structures and Algorithms");

        System.out.println();

        user1.displayBorrowedBooks();

        System.out.println();

        user2.displayBorrowedBooks();

        System.out.println();

        library.returnBook(user1, book1);

        System.out.println();

        library.displayBooks();

    }
}

