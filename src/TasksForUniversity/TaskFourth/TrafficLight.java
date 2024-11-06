package src.TasksForUniversity.TaskFourth;

public enum TrafficLight {
    RED(30),
    YELLOW(5),
    GREEN(60);


    private final int duration;


    TrafficLight(int duration) {
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }
}

