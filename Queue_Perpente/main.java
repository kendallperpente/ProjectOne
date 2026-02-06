/*3
4: Queues
• Read the following tutorial page about “Java Queue Collection Tutorial and Examples”
https://www.codejava.net/java-core/collections/java-queue-collection-tutorial-and-examples
and create a projects to complete the following tasks based on the examples on the tutorial page.
Ignore the BlockingQueue-related parts:
1. Using java.util.ArrayDeque, create a project called QueueExamples_<LastNames> to
implement a FIFO queue. Complete the following tasks
2. The java.util.PriorityQueue class is implemented based on a binary heap. The following link
contains an example of a priority queue of integers: https://www.educative.io/edpresso/how-
to-use-priorityqueue-in-java. In this program, 9 numbers are added to a priority queue, and
all integers are removed one at a time from the priority queue. Create a project called
PriorityQueue_<LastNames> based on this program and make the following revisions.
a) Before removing any element from the priority queue, add code to display all elements
in the priority queue. Pay attention to the fact that the result is not a sorted list of
numbers, since it is a binary heap.
b) In the current version of the program, when elements are removed from the priority
queue, the smallest is removed first and the largest removed the last. Use the
java.util.Comparator interface to revise the code so that when elements are removed
from the priority queue, the largest is removed first, and the smallest is removed last.
The following link contains an example that performs a similar functionality.
https://w */

import java.util.*;

public class main {
    public static void main(String[] args) {
        
        // ===== Task 1: FIFO Queue using ArrayDeque =====
        System.out.println("===== Task 1: FIFO Queue with ArrayDeque =====\n");
        
        // Creating a Queue using LinkedList
        List<String> listNames = Arrays.asList("Alice", "Bob", "Cole", "Dale", "Eric", "Frank");
        Queue<String> queueNames = new LinkedList<>(listNames);
        System.out.println("Queue initialized with names: " + queueNames);
        
        // Queue operations
        Queue<String> queueCustomers = new LinkedList<>();
        queueCustomers.add("Mary");
        queueCustomers.add("John");
        queueCustomers.add("Sarah");
        System.out.println("Queue after adding: " + queueCustomers);
        
        // Remove from queue (FIFO - First In First Out)
        String next = queueCustomers.poll();
        System.out.println("Customer removed: " + next);
        System.out.println("Queue after removal: " + queueCustomers);
        
        // Using offer() and poll() methods
        Queue<String> queueNames2 = new LinkedList<>();
        System.out.println("\nUsing offer() method:");
        queueNames2.offer("Jack");
        queueNames2.offer("Jane");
        queueNames2.offer("Joe");
        System.out.println("Queue: " + queueNames2);
        System.out.println("Next: " + queueNames2.poll());
        System.out.println("Next: " + queueNames2.poll());
        System.out.println("Next: " + queueNames2.poll());
        System.out.println("Next: " + queueNames2.poll()); // returns null
        
        // ArrayDeque as a FIFO Queue
        System.out.println("\nUsing ArrayDeque as FIFO Queue:");
        Deque<String> arrayDequeQueue = new ArrayDeque<>();
        arrayDequeQueue.offer("Katherine");
        arrayDequeQueue.offer("Bob");
        arrayDequeQueue.addLast("Jim");
        arrayDequeQueue.addLast("Tom");
        System.out.println("ArrayDeque: " + arrayDequeQueue);
        System.out.println("Remove first: " + arrayDequeQueue.pollFirst());
        System.out.println("Remove last: " + arrayDequeQueue.pollLast());
        System.out.println("ArrayDeque after removals: " + arrayDequeQueue);
        
        // Peek operations
        System.out.println("\nPeek operations:");
        Deque<Integer> queueNumbers = new ArrayDeque<>();
        queueNumbers.add(10);
        queueNumbers.add(20);
        queueNumbers.add(30);
        queueNumbers.add(40);
        System.out.println("First: " + queueNumbers.getFirst());
        System.out.println("Last: " + queueNumbers.peekLast());
        
        // Iterate over queue
        System.out.println("\nIterating over Queue:");
        Queue<String> queueNames3 = new LinkedList<>();
        queueNames3.add("Dale");
        queueNames3.add("Bob");
        queueNames3.add("Frank");
        queueNames3.add("Alice");
        queueNames3.add("Eric");
        queueNames3.add("Cole");
        queueNames3.add("John");
        
        for (String name : queueNames3) {
            System.out.println(name);
        }
        
        // ===== Task 2: PriorityQueue Examples =====
        System.out.println("\n\n===== Task 2a: PriorityQueue with Min-Heap (Default) =====\n");
        
        // Create a priority queue of integers (min-heap by default)
        PriorityQueue<Integer> minHeapQueue = new PriorityQueue<>();
        
        // Add 9 numbers to the priority queue
        int[] numbers = {42, 15, 23, 87, 5, 34, 12, 99, 56};
        for (int num : numbers) {
            minHeapQueue.offer(num);
        }
        
        // Display all elements in the priority queue (binary heap structure)
        System.out.println("All elements in Priority Queue (binary heap structure - not sorted):");
        System.out.println(minHeapQueue);
        
        System.out.println("\nRemoving elements from min-heap Priority Queue (smallest to largest):");
        // Remove all elements one by one
        while (!minHeapQueue.isEmpty()) {
            System.out.println("Removed: " + minHeapQueue.poll());
        }
        
        // ===== Task 2b: PriorityQueue with Max-Heap (Custom Comparator) =====
        System.out.println("\n\n===== Task 2b: PriorityQueue with Max-Heap (Reverse Order) =====\n");
        
        // Create a priority queue with custom comparator for max-heap
        PriorityQueue<Integer> maxHeapQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add the same 9 numbers
        for (int num : numbers) {
            maxHeapQueue.offer(num);
        }
        
        // Display all elements in the max-heap priority queue
        System.out.println("All elements in Max-Heap Priority Queue (binary heap structure - not sorted):");
        System.out.println(maxHeapQueue);
        
        System.out.println("\nRemoving elements from max-heap Priority Queue (largest to smallest):");
        // Remove all elements one by one (largest first)
        while (!maxHeapQueue.isEmpty()) {
            System.out.println("Removed: " + maxHeapQueue.poll());
        }
        
        // ===== Additional PriorityQueue Example with Strings =====
        System.out.println("\n\n===== PriorityQueue with Strings (Alphabetical Order) =====\n");
        
        Queue<String> priorityQueueNames = new PriorityQueue<>();
        priorityQueueNames.add("Dale");
        priorityQueueNames.add("Bob");
        priorityQueueNames.add("Frank");
        priorityQueueNames.add("Alice");
        priorityQueueNames.add("Eric");
        priorityQueueNames.add("Cole");
        priorityQueueNames.add("John");
        
        System.out.println("All elements in String Priority Queue (not sorted as heap):");
        System.out.println(priorityQueueNames);
        
        System.out.println("\nRemoving elements from Priority Queue (alphabetical order):");
        priorityQueueNames.forEach(name -> System.out.println(name));
        
        System.out.println("\nRemoving one by one:");
        while (!priorityQueueNames.isEmpty()) {
            System.out.println("Removed: " + priorityQueueNames.poll());
        }
        
        // ===== Synchronized List Example =====
        System.out.println("\n\n===== Synchronized Collection Example =====\n");
        List<String> synchronizedList = Collections.synchronizedList(new LinkedList<>());
        synchronizedList.add("Element 1");
        synchronizedList.add("Element 2");
        synchronizedList.add("Element 3");
        System.out.println("Synchronized List: " + synchronizedList);
    }
}
