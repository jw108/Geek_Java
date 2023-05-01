package HomeWork.SEMINAR_4;

import java.util.LinkedList;

public class MyList {
    private final LinkedList<Integer> myList;
    MyList(LinkedList<Integer> listInt) {
        this.myList = listInt;
    }
    LinkedList<Integer> reverse(LinkedList<Integer> listInt){
        LinkedList<Integer> temp = new LinkedList<>();
        for (Integer i: listInt) {
            temp.addFirst(i);
        }
        return temp;
    }
    void enqueue(int value){
        this.myList.add(value);
    }
    int dequeue(){
        return  myList.removeFirst();
    }
    int first(){
        return myList.getFirst();
    }
     LinkedList<Integer> getMyList() {
        return myList;
    }
}