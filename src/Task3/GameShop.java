package src.Task3;

import java.util.ArrayList;
import java.util.List;

public class GameShop {
    List<Game> games = new ArrayList<>();
    private double earnings = 0;

    public void addGame(Game game) {
        games.add(game);
    }

    public void buyGame(Customer customer) {
        for (Game game : games) {
            if (game.getName().equals(customer.getDesiredGame())) {
                if (customer.getWallet() >= game.getPrice()) {
                    customer.reduceWallet(game.getPrice());
                    earnings += game.getPrice();
                    System.out.println(customer.getName() + " купил игру " + game.getName() + " за $" + game.getPrice());
                    games.remove(game);
                    return;
                } else {
                    System.out.println(customer.getName() + " не хватает денег на " + game.getName());
                    return;
                }
            }
        }
        System.out.println(customer.getName() + " не нашел желаемую игру в магазине.");
    }

    public double getEarnings() {
        return earnings;
    }

    public int getSoldGamesCount(int initialGamesCount) {
        return initialGamesCount - games.size();
    }
}

