package src.tasksForUniversity.TaskSecond;

;

abstract  class Bird implements Flyable {

    int wings;

    String name;

    int age;


    public int getWings() {
        return wings;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public void fly(){
        System.out.println("Можем летать");
    }
}
