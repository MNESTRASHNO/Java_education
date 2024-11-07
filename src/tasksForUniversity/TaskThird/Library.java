package src.tasksForUniversity.TaskThird;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private final Map<String, Book> catalogBook;

   private final Map<Integer, Reader>  readers;

   public  Library() {
       this.catalogBook = new HashMap<>();
       this.readers = new HashMap<>();
   }

   public Book getBook(String name){
       return this.catalogBook.remove(name);
   }

   public void addToCatalog(Book book){
       this.catalogBook.putIfAbsent(book.getName(), book);
   }

   public void addReader(Reader reader){
       this.readers.putIfAbsent(reader.getReaderId(), reader);
   }

    public List<Book> getCatalog() {
        return this.catalogBook.values().stream().toList();
    }

    public Map<Integer, Reader> getReaders() {
        return readers;
    }

    public void printAvailableBooks() {
        if (catalogBook.isEmpty()) {
            System.out.println("В библиотеке нет доступных книг.");
        } else {
            System.out.println("Книги, доступные в библиотеке:");
            for (Book book : catalogBook.values()) {
                System.out.println(book.getName());
            }
            System.out.println("Всего доступно книг: " + catalogBook.size());
        }
    }

    // Вывод всех читателей
    public void printReaders() {
        if (readers.isEmpty()) {
            System.out.println("В библиотеке нет зарегистрированных читателей.");
        } else {
            System.out.println("Читатели:");
            for (Reader reader : readers.values()) {
                System.out.println(reader.getName());
            }
            System.out.println("Всего читателей: " + readers.size());
        }
    }

    // кол-во  всех читателей
    public void printBorrowedBooksCount() {
        int totalBorrowedBooks = 0;
        for (Reader reader : readers.values()) {
            totalBorrowedBooks += reader.getBorrowedBooks().size();
        }
        System.out.println("Всего книг у читателей: " + totalBorrowedBooks);
    }
}
