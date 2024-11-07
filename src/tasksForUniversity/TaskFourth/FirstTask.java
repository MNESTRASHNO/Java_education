package src.tasksForUniversity.TaskFourth;


import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FirstTask {
    public static void main(String[] args) {
        Path directoryPath = Paths.get("src/tasksForUniversity/test_directory");
        Path filePath = directoryPath.resolve("ILoveBerserk.txt");
        try {
            if (!Files.exists(directoryPath)) {
                Files.createDirectory(directoryPath);
                System.out.println("Директория \"" + directoryPath + "\" создана.");
            }
            try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
                writer.write("Что вершит судьбу человечества в этом мире? \nНекое незримое существо или закон, подобно Длани Господней парящей над миром? " +
                        "\nПо крайне мере истинно то, что человек не властен даже над своей волей.  ");

                System.out.println("Файл \"" + filePath.getFileName() + "\" создан и заполнен.");
            }

            try (BufferedReader reader = Files.newBufferedReader(filePath)) {
                System.out.println("Содержимое файла:");
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            Thread.sleep(100000);

            Files.delete(filePath);
            System.out.println("ече удален.");
        } catch (IOException e) {
            System.err.println("Ошибка работы с файлами: " + e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
