package src.tasksForUniversity.TaskSecond;

abstract class Vehicle implements Flyable{

    String brand;

    int age;

    public int getAge() {
        return age;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void fly(){
        System.out.println("В будущем может");
    }
}
