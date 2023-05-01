package HomeWork.SEMINAR_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TASK4_1 {
    public static void main(String[] args) {
        int listSize = 20;
        LinkedList<Integer> listInt = new LinkedList<>();
        for (int i = 0; i < listSize; i++) {
            listInt.add(listSize - i);
        }
        MyList myList = new MyList(listInt);
        
//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void),
//который вернет “перевернутый” список.
        System.out.println(listInt);
        LinkedList<Integer> temp = myList.reverse(listInt);
        System.out.println(temp);
        
//2) Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
        myList.enqueue(55);
        myList.enqueue(32);
        System.out.println(myList.getMyList());
        int deleteFirst = myList.dequeue();
        System.out.printf("Удалить значение первого элемента - %d\n",
                            deleteFirst);
        System.out.println(myList.getMyList());
        int first = myList.first();
        System.out.printf("Значение первого элемента - %d\n", first);
        System.out.println(myList.getMyList());
        summ();
    }
    static void summ() {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
         */
        System.out.println("Задание 3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.");
        Random random = new Random();
        LinkedList<Integer> myList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            myList.add(random.nextInt(10));
        }
        System.out.println(myList);
        System.out.println("Сумма элементов коллекции: " + sumOfElements(myList));
    }

    static int sumOfElements(LinkedList<Integer> myList) {
        Iterator<Integer> iterator = myList.listIterator();
        int sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}