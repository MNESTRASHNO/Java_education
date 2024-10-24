package src.TaskThird;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        String[] bookNames = new String[]{
                "1984", "NEW BRAVE WORLD",
                "WE", "KGBT+", "NeverWhere"
        };

        String[] names = new String[]{
                "Илюха", "Max",
                "Roman", "Ded",
                "Artem"
        };


        Library library = new Library();

        for (int i = 0; i < bookNames.length; i++){
            int index = new Random().nextInt(bookNames.length);

            String bookName = bookNames[index];

            library.addToCatalog(new Book(bookName));
        }

        for(String name : names){
            Reader reader = new Reader(name);

            library.addReader(reader);
        }
        System.out.println(library.getCatalog());
        System.out.println();
        System.out.println(library.getReaders());


    }
}
