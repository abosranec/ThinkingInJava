package head_11.example11_14;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListFeatures {
  public static void main(String[] args) {
    LinkedList<Integer> pets = new LinkedList<>(Arrays.asList(1,2,3,4,5));
    System.out.println(pets);
    // Identical:
    System.out.println("pets.getFirst(): " + pets.getFirst());
    System.out.println("pets.element(): " + pets.element());
    // Only differs in empty-list behavior:
    System.out.println("pets.peek(): " + pets.peek());
    // Identical; remove and return the first element:
    System.out.println("pets.remove(): " + pets.remove());
    System.out.println("pets.removeFirst(): " + pets.removeFirst());
    // Only differs in empty-list behavior:
    System.out.println("pets.poll(): " + pets.poll());
    System.out.println(pets);
    pets.addFirst(6);
    System.out.println("After addFirst(): " + pets);
    pets.offer(7);
    System.out.println("After offer(): " + pets);
    pets.add(8);
    System.out.println("After add(): " + pets);
    pets.addLast(9);
    System.out.println("After addLast(): " + pets);
    System.out.println("pets.removeLast(): " + pets.removeLast());
  }
}
