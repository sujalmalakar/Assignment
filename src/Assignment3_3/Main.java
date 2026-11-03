package Assignment3_3;

import Assignment3_3.library.model.Book;
import Assignment3_3.library.model.LibraryMember;
import Assignment3_3.library.system.Library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Harry Potter", "J.K. Rowling", "111");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "222");

        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        System.out.println();

        library.borrowBook(member1, book1);
        library.returnBook(member1, book1);

        System.out.println();

        library.reserveBook(member1, book2);
        library.displayReservedBooks(member1);

        System.out.println();

        library.reserveBook(member2, book2);

        System.out.println();

        library.cancelReservation(member1, book2);
        library.displayReservedBooks(member1);
    }
}
