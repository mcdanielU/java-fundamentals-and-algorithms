package Collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(7);
        pq.add(4);
        pq.add(-1);

        System.out.println(pq.peek());
    }
}
