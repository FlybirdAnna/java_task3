import java.io.*;

public class FileReadWrite{

    public static void writeToFile(String filename, String data) throws MyException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(data);
        } catch (IOException e) {
            throw new MyException("Ошибка при записи в файл: " + filename, e);
        }
    }


    public static String readFromFile(String filename) throws MyException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new MyException("Ошибка при чтении из файла: " + filename, e);
        }
        return content.toString();
    }
}
