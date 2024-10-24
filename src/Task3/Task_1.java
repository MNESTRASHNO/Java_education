package src.Task3;

public class Task_1 {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавляем книги в библиотеку
        library.addToCatalog(new Book("Война и мир"));
        library.addToCatalog(new Book("Преступление и наказание"));
        library.addToCatalog(new Book("Мастер и Маргарита"));
        library.addToCatalog(new Book("Гарри Поттер"));
        library.addToCatalog(new Book("Шерлок Холмс"));
        library.addToCatalog(new Book("Три товарища"));
        library.addToCatalog(new Book("Анна Каренина"));
        library.addToCatalog(new Book("Идиот"));
        library.addToCatalog(new Book("Оно"));
        library.addToCatalog(new Book("Дюна"));

        // Добавляем читателей
        Reader reader1 = new Reader("Иван");
        Reader reader2 = new Reader("Мария");
        Reader reader3 = new Reader("Алексей");
        Reader reader4 = new Reader("Екатерина");
        Reader reader5 = new Reader("Дмитрий");

        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);
        library.addReader(reader4);
        library.addReader(reader5);

        // Выдаём книги читателям
        reader1.borrowBook(library.getBook("Война и мир"));
        reader2.borrowBook(library.getBook("Мастер и Маргарита"));
        reader3.borrowBook(library.getBook("Гарри Поттер"));
        reader4.borrowBook(library.getBook("Идиот"));
        reader5.borrowBook(library.getBook("Дюна"));

        // Вывод данных
        library.printAvailableBooks();
        library.printReaders();
        library.printBorrowedBooksCount();
    }
}
