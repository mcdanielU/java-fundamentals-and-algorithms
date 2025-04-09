package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> myLinkedList = new LinkedList<>(List.of(1,2,3,4,5,6));

        for (Integer x:
             myLinkedList) {
            System.out.println(myLinkedList.get(x));
        }
    }
}
