package src.TasksForUniversity.TaskFourth;

public class SecondTask{
    public static void main(String[] args) {
        TrafficLight currentLight = TrafficLight.RED;

        while (true) {
            System.out.println("Светофор: " + currentLight + ". Ждать " + currentLight.getDuration() + " секунд.");

            try {
                Thread.sleep(currentLight.getDuration() * 1000L); // умножаем на 1000, чтобы перевести в миллисекунды
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            currentLight = getNextLight(currentLight);
        }
    }

    private static TrafficLight getNextLight(TrafficLight currentLight) {
        switch (currentLight) {
            case RED:
                return TrafficLight.GREEN;
            case GREEN:
                return TrafficLight.YELLOW;
            case YELLOW:
                return TrafficLight.RED;
            default:
                throw new IllegalArgumentException("Неизвестное состояние светофора: " + currentLight);
        }
    }
}

