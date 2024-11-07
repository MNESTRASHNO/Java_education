package src.MyLittleUbojestvo.OOP;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 10;
        box.height = 10;
        box.lenght = 10;
        box.getVolume();

        Dog dog = new Dog();
        dog.breed = "pug";
        dog.name = "Mika";
        dog.legs = 4;
        dog.getDogsParams();
        dog.speed = 5;

        dog.run();
    }
}
