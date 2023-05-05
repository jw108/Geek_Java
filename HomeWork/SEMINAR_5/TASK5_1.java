package HomeWork.SEMINAR_5;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//Добавить функции 1) Добавление номера
//2) Вывод всего
//Пример:
//Я ввожу: 1
//К: Введите фамилию
//Я: Иванов
//К: Введите номер
//Я: 1242353
//К: Введите 1) Добавление номера
//2) Вывод всего
//Я ввожу: 1
//К: Введите фамилию
//Я: Иванов
//К: Введите номер
//Я: 547568
//К: Введите 1) Добавление номера
//2) Вывод всего
//Я: 2
//Иванов: 1242353, 547568


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TASK5_1 {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in, "cp866");

        boolean book = true;

        while (book) {
            System.out.println();
            System.out.println("Введите команду:\n1- Добавить номер в записную книгу,\n" +
                    "2- Показать все контакты,\n" +
                    "0- Выйти из записной книги: ");
            String operation = sc.nextLine();
            switch (operation) {
                case "1":
                    AddContact(phoneBook, sc);
                    break;
                case "2":
                    showAllContacts(phoneBook);
                    break;
                case "0":
                    book = false;
                    System.out.println("До встречи!");
                    break;
                default:
                    System.out.println("Неверная операция.");
                    break;
            }
        }
    }

    public static void AddContact(Map<String, ArrayList<String>> db, Scanner scanner) {
        System.out.println();
        ArrayList<String> phone_number = new ArrayList<>();
        System.out.println("Введите ФИО контакта: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.println();
        System.out.println("Введите введите номер телефона: ");
        String number = scanner.nextLine();
        if (!db.containsKey(name)) {
            // phone_number.add(number);
            db.put(name, phone_number);
        }
        db.get(name).add(number);

    }


    public static void showAllContacts(Map<String, ArrayList<String>> book) {
        System.out.println();
        for (String name : book.keySet()) {
            System.out.printf("Имя: " + name + "\n");
            ArrayList<String> phones = book.get(name);
            for (String phone : phones) {
                System.out.printf("Номер телефона: " + phone + "\n");
            }
            System.out.println();
        }
    }
}