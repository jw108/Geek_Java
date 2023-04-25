package SEMINARS;

import java.io.FileWriter;

public class TASK_2 {
    public static void main(String[] args) {
        String text = "Test";
        int n = 5;
        SaveFile(RepeatString(text, n));
        
    }
    static void SaveFile(String s) {
        String path = "test.txt";
        try (FileWriter fw = new FileWriter(path, true);){
            fw.write(s); // Подготовка к записи в файл
            fw.write('\n');
            fw.flush(); // Запись в файл            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    static String RepeatString (String s, int n) {
        return s.repeat(n);
    }    

    static boolean ex2(String s){
            /*
            Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
            (возвращает boolean значение).

            Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
            */
            s = s.replace(" ", "");
            StringBuilder stringBuilder1 = new StringBuilder(s);
            stringBuilder1.reverse();
            return stringBuilder1.toString().equalsIgnoreCase(s);
        }

    static String ex1(String s){
        /*
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcddaa.
        Результат: a4b3cd2a2
        */
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = s.toCharArray();
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                count++;
            } else {
                stringBuilder.append(arr[i-1]);
                if (count > 1){
                    stringBuilder.append(count);
                    count = 1;
                }
            }
        }
        stringBuilder.append(arr[arr.length-1]);
        if (count > 1){
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}