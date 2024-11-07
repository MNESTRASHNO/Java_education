package src.tasksForUniversity.TaskSecond;

abstract class insects implements Flyable{

    insects(String name, int age, String squad){
        this.age = age;
        this.name = name;
        this.squad = squad;
    }


    String squad;

    int age;

    String name;

    public String getSquad() {
        return squad;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public void fly(){
        System.out.println("МОЖЕТ, но не все");
    }
}
