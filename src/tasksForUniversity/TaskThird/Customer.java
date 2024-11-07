package src.tasksForUniversity.TaskThird;

public class Customer {
    private String name;
    private double wallet;
    private String desiredGame;

    public Customer(String name, double wallet, String desiredGame) {
        this.name = name;
        this.wallet = wallet;
        this.desiredGame = desiredGame;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public String getDesiredGame() {
        return desiredGame;
    }

    public void reduceWallet(double amount) {
        this.wallet -= amount;
    }

    @Override
    public String toString() {
        return name + " (хочет купить " + desiredGame + ", в кошельке $" + wallet + ")";
    }
}

