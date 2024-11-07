package src.myLittleUbojestvo.OOP;

public class Dog {
    int legs = 4;

    String name;

    String breed;

    int speed;

    void getDogsParams(){

        System.out.println(name + ", " + legs +", " + breed + " " + "ЭТО САМЫЙ ХОРОШИЙ И ДОБРЫЙ ПЕСЁЛЬ НА ЗЕМЛЕ!");
    }

    void run(){
        for(int i = 0; i < speed; i++){
            System.out.println("БЕГУ ПРЯМО В ДВЕРЬ - ВСТРЕЧАТЬ МАМУ");
        }
    }
}
