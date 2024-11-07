package src.tasksForUniversity.TaskFourth;

public enum TrafficLight {
    RED(1),
    YELLOW(2),
    GREEN(3);


    private final int duration;


    TrafficLight(int duration) {
        this.duration = duration;
    }


    public int getDuration() {
        return duration;
    }
}

