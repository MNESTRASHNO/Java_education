package src.Task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Reader {

    private int readerId;


    private String name;


    private LocalDate registrationDate;


    private Map<String, Book> takenBooks;

    private List<Book> borrowedBooks;


    public Reader(String name) {
        this.name = name;
        this.readerId = ThreadLocalRandom.current().nextInt(1000);
        this.registrationDate = LocalDate.now();
        this.takenBooks = new HashMap<>();
        this.borrowedBooks = new ArrayList<>();
    }


    public int getReaderId() {
        return readerId;
    }


    public String getName() {
        return name;
    }

    public List<Book> getTakenBooks() {
        return takenBooks.values().stream().toList();
    }

    public void takeBook(Book book) {
        this.takenBooks.putIfAbsent(book.getName(), book);
    }

    @Override
    public String toString() {
        return getName();
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Метод для взятия книги
    public void borrowBook(Book book) {
        if (book != null) {
            borrowedBooks.add(book);
        }

    }
}