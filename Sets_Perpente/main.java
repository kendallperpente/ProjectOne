import java.util.*;
public class main {

    public static void main(String[] args) {
        System.out.println(" reating Sets");
        createSets();
        
        System.out.println("\n Basic Operations");
        basicOperations();
        
        System.out.println("\n Iterating Elements");
        iterateElements();
        
        System.out.println("\n Searching Elements");
        searchElements();
        
        System.out.println("\n Bulk Operations");
        bulkOperations();
        
        System.out.println("\n TreeSet with Comparator");
        treeSetWithComparator();
    }

    // Create a new set and display the values in it
    public static void createSets() {
        // HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        System.out.println("HashSet: " + numbers);
        
        // LinkedHashSet
        Set<String> names = new LinkedHashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        System.out.println("LinkedHashSet: " + names);
        
        // TreeSet
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println("Original list: " + listNumbers);
        Set<Integer> uniqueNumbers = new TreeSet<>(listNumbers);
        System.out.println("TreeSet (sorted, unique): " + uniqueNumbers);
    }

    // Perform basic operations on a set
    public static void basicOperations() {
        Set<String> names = new HashSet<>();
        
        // Adding elements
        names.add("Tom");
        names.add("Mary");
        
        if (names.add("Peter")) {
            System.out.println("Peter is added to the set");
        }
        
        if (!names.add("Tom")) {
            System.out.println("Tom is already added to the set");
        }
        
        // Removing elements
        if (names.remove("Mary")) {
            System.out.println("Mary is removed");
        }
        
        // Check emptiness
        if (names.isEmpty()) {
            System.out.println("The set is empty");
        } else {
            System.out.println("The set is not empty");
        }
        
        // Get total number of elements
        names.add("Alice");
        System.out.printf("The set has %d elements\n", names.size());
        
        // Remove all elements
        names.clear();
        
        if (names.isEmpty()) {
            System.out.println("The set is empty after clear()");
        }
    }

    // Iterating over elements in a set
    public static void iterateElements() {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");
        
        System.out.println("Using Iterator:");
        Iterator<String> iterator = names.iterator();
        
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        
        System.out.println("\nUsing for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Search for an element in a set
    public static void searchElements() {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");
        
        if (names.contains("Mary")) {
            System.out.println("Found Mary");
        }
        
        if (!names.contains("John")) {
            System.out.println("John not found");
        }
    }

    // Perform bulk operations between two sets
    public static void bulkOperations() {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
        
        System.out.println("Set 1: " + s1);
        System.out.println("Set 2: " + s2);
        
        // Check subset
        if (s1.containsAll(s2)) {
            System.out.println("s2 is a subset of s1");
        }
        
        // Union
        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("Union: " + union);
        
        // Intersection
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("Intersection: " + intersection);
        
        // Difference (s1 - s2)
        Set<Integer> difference = new HashSet<>(s1);
        difference.removeAll(s2);
        System.out.println("Difference (s1 - s2): " + difference);
    }

    // TreeSet with Comparator for descending order
    public static void treeSetWithComparator() {
        // TreeSet in natural (ascending) order
        Set<String> ascendingSet = new TreeSet<>();
        ascendingSet.add("Banana");
        ascendingSet.add("Apple");
        ascendingSet.add("Orange");
        ascendingSet.add("Mango");
        ascendingSet.add("Grapes");
        
        System.out.println("TreeSet (ascending order): " + ascendingSet);
        
        // TreeSet in descending order using Comparator
        Set<String> descendingSet = new TreeSet<>(Comparator.reverseOrder());
        descendingSet.add("Banana");
        descendingSet.add("Apple");
        descendingSet.add("Orange");
        descendingSet.add("Mango");
        descendingSet.add("Grapes");
        
        System.out.println("TreeSet (descending order): " + descendingSet);
    }
}
