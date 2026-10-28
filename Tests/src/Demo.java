import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        // Creating LinkedList of Integer type
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("---- Queue Interface Methods ----");

        // Queue methods
        list.add(10);          // insert
        list.add(20);
        list.offer(30);        // insert

        System.out.println("LinkedList : " + list);

        System.out.println("Element at head (peek): " + list.peek());
        System.out.println("Removed element (poll): " + list.poll());

        System.out.println("After poll : " + list);

        System.out.println("\n---- Deque Interface Methods ----");

        // Deque methods
        list.addFirst(5);
        list.addLast(40);

        System.out.println("After addFirst & addLast : " + list);

        System.out.println("First element : " + list.getFirst());
        System.out.println("Last element : " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("After removeFirst & removeLast : " + list);

        System.out.println("\n---- Reverse Order ----");

        // Printing elements in reverse order
        Iterator<Integer> itr = list.descendingIterator();
        System.out.print("Reverse LinkedList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n\n---- First & Last Occurrence ----");

        // Repeating an element
        list.add(20);
        list.add(50);
        list.add(20);

        System.out.println("Updated LinkedList : " + list);

        System.out.println("First occurrence of 20 : " + list.indexOf(20));
        System.out.println("Last occurrence of 20 : " + list.lastIndexOf(20));

        System.out.println("\n---- Empty the LinkedList ----");

        // Clearing LinkedList
        list.clear();

        System.out.println("LinkedList after clear() : " + list);
        System.out.println("Is LinkedList empty? " + list.isEmpty());
    }
}
