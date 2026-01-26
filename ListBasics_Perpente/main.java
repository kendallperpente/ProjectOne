import java.util.*;

public class main {

    public static void main(String[] args) {

        System.out.println("Array List");
        arrayListExamples();

        System.out.println("\nLinked List");
        linkedListExamples();
    }

    public static void arrayListExamples() {
        // 1. Creating a List
        List<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits list: " + fruits);

        // 3. Adding element at specific index
        fruits.add(1, "Strawberry");
        System.out.println("After adding at index 1: " + fruits);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + fruits.get(2));

        // 5. Updating elements
        fruits.set(0, "Green Apple");
        System.out.println("After updating index 0: " + fruits);

        // 6. Removing elements
        fruits.remove("Banana");
        fruits.remove(2);
        System.out.println("After removals: " + fruits);

        // 7. Checking size
        System.out.println("List size: " + fruits.size());

        // 8. Checking if list contains an element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 9. Checking if list is empty
        System.out.println("Is list empty? " + fruits.isEmpty());

        // 10. Iterating using for-each loop
        System.out.println("Iterating with for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Iterating using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // LinkedList examples (same operations, different implementation)
    public static void linkedListExamples() {
        List<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Elephant");

        System.out.println("Animals list: " + animals);

        animals.add(2, "Lion");
        System.out.println("After adding at index 2: " + animals);

        animals.remove("Cat");
        System.out.println("After removing Cat: " + animals);

        System.out.println("First element: " + animals.get(0));
        System.out.println("List size: " + animals.size());

        System.out.println("Iterating through LinkedList:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}