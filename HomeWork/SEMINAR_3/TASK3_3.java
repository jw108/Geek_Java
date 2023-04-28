package HomeWork.SEMINAR_3;

import java.util.*;

public class TASK3_3 {
    public static void main(String[] args) {
        System.out.println("-----Задание 3-----");
        printPlanets(20);
    }

    static void printPlanets(int listSize) {
        Random random = new Random();
        String[] list = {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"};
        List<String> newList = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            newList.add(list[random.nextInt(list.length)]);
        }
        System.out.println(newList);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " встречается " + Collections.frequency(newList, list[i]) + " раз(а)");
        }
        System.out.println();

    }
}