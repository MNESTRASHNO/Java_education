package src.TasksForUniversity.TaskThird;

import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        GameShop shop = new GameShop();

        // Добавим игры в магазин
        shop.addGame(new Game("Монополия", 25.0));
        shop.addGame(new Game("Каркассон", 30.0));
        shop.addGame(new Game("Колонизаторы", 35.0));
        shop.addGame(new Game("Уно", 10.0));
        shop.addGame(new Game("Шахматы", 20.0));
        shop.addGame(new Game("Манчкин", 40.0));
        shop.addGame(new Game("Дженга", 15.0));
        shop.addGame(new Game("Имаджинариум", 25.0));
        shop.addGame(new Game("Эволюция", 30.0));
        shop.addGame(new Game("Свинтус", 10.0));

        // Список покупателей
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Иван", 40.0, "Монополия"));
        customers.add(new Customer("Мария", 15.0, "Дженга"));
        customers.add(new Customer("Алексей", 50.0, "Манчкин"));
        customers.add(new Customer("Екатерина", 20.0, "Шахматы"));
        customers.add(new Customer("Дмитрий", 5.0, "Свинтус"));

        // Симуляция покупки
        int initialGamesCount = shop.games.size();
        for (Customer customer : customers) {
            shop.buyGame(customer);
        }

        // Вывод результата
        System.out.println("Продано игр: " + shop.getSoldGamesCount(initialGamesCount));
        System.out.println("Общий заработок: $" + shop.getEarnings());
    }
}

