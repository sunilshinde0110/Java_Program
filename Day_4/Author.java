package assignment_6;

import java.util.ArrayList;

public class Author {
    public static void main(String[] args) {
        var bookArrayList = new ArrayList<Book>();

        var book_01 = new Book("Java in a Nutshell", "Education", 3400);
        var book_02 = new Book("Harry Potter", "Fiction", 210);
        var book_03 = new Book("Percy jackson", "Children", 175);

        bookArrayList.add(book_01);
        bookArrayList.add(book_02);
        bookArrayList.add(book_03);

        System.out.println("Total Number of Books= " + bookArrayList.size());
        book_01.printInfo();
    }
}
