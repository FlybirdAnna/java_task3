import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Имя файла для записи: ");
        String filename = scanner.nextLine();

        System.out.print("Запишите самые сокровенные мысли: ");
        String textToWrite = scanner.nextLine();

        try {
            FileReadWrite.writeToFile(filename, textToWrite);

            String result = FileReadWrite.readFromFile(filename);
            System.out.println("Ваши записи:\n" + result);

        } catch (MyException e) {
            System.err.println("Упсссс...ошибочка:");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

