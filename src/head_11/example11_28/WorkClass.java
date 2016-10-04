package head_11.example11_28;

import java.util.*;

/**
 * Created by Pasha on 04.10.2016.
 */
public class WorkClass {
    public static void print(Queue<Integer> queue){
        while (queue.peek()!=null)
            System.out.print(queue.remove() + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(10));
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(queue);

        System.out.print("Queue:         ");
        print(queue);

        System.out.print("PriorityQueue: ");
        print(priorityQueue);
    }
}
