package src.tasksForUniversity.TaskSecond;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Flyable> items = new ArrayList<>();

    public void add(Flyable item) {
        items.add(item);
    }

    public void flyAll() {
        for (Flyable item : items) {
            item.fly();
        }
    }
}
