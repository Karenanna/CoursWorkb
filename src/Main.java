import task.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    private static Servis servis;
    public static void main(String[] args){
        servis = new Servis();
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            inputTask(scanner);
                            break;
                        case 2:
                            // todo: обрабатываем пункт меню 2
                            break;
                        case 3:
                            // todo: обрабатываем пункт меню 3
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void inputTask(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Введите название задачи: ");
        String taskName = scanner.nextLine();
        System.out.println("Ведите описание задачи:");
        String description = scanner.nextLine();
        boolean workIs;
        System.out.println("Эта задача рабочая?");
        switch (scanner.nextLine()) {
            case "1":
            case "да":
            case "y":
            case "yes":
            case "Yes":
            case "YES":
                workIs = true;
                break;
            default:
                workIs = false;
        }

        LocalDateTime dateAndTime  = null;
        System.out.println("Ведите дату и время задачи (14.03.1987 00:00:00");
        boolean shouldEnterAgain = true;
        while (shouldEnterAgain) {
            try {
                dateAndTime = LocalDateTime.parse(scanner.nextLine(), Task.DATE_TIME_FORMATTER);
                shouldEnterAgain = false;
            } catch (DateTimeParseException e) {
                System.out.println("Формат неправилный");
            }
        }
        Task task;
        System.out.println("Повторяемость");
        System.out.println("\t - 0 - не повторяется");
        System.out.println("\t - 1 - ежедневно");
        System.out.println("\t - 2 - еженедельно");
        System.out.println("\t - 3 - ежемесячно");
        System.out.println("\t - 1 - ежегодно");
        switch (scanner.next()) {
            case "1":
                task = new Daily(taskName, description, workIs, dateAndTime);
                break;
            case "2":
                task = new Weekly(taskName, description, workIs, dateAndTime);
                break;
            case "3":
                task = new Monthly(taskName, description, workIs, dateAndTime);
                break;
            case "4":
                task = new Yearly(taskName, description, workIs, dateAndTime);
                break;
            default:
                task = new SingleTime(taskName, description, workIs,dateAndTime);

        }

        servis.addTask(task);
        // todo
    }



    private static void printMenu() {
        System.out.println(
                "1. Добавить задачу" +
                "2. Удалить задачу" +
                "3. Получить задачу на указанный день" +
                "0. Выход"
        );
    }
}



