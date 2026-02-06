import java.util.*;

/*        Sorting a list according to natural ordering of elements
        Reversing sort order
        Sorting a list whose elements of a custom type
        Sorting a list using a Comparator */

public class main {

    public static void main(String[] args) {
        System.out.println("Creating Natural Order");
        natural_order();

        System.out.println("\nReversing the order");
        reverse_order();

        System.out.println("\nOrder by names");
        emplyee_order();    

    }


public static void natural_order() {
        List<String> listStrings = Arrays.asList("Cat", "Dog", "Horse", "Pig", "Cow", "Sheep");
        System.out.println("Before sorting: " + listStrings);
        Collections.sort(listStrings);
        System.out.println("After sorting: " + listStrings);

        }

public static void emplyee_order(){
    List<Employee> listEmployees = new ArrayList<Employee>();
    listEmployees.add(new Employee("Tom", 45, 80000));
    listEmployees.add(new Employee("Sam", 56, 75000));
    listEmployees.add(new Employee("Alex", 30, 120000));
    listEmployees.add(new Employee("Peter", 25, 60000));
    System.out.println("Before sorting: " + listEmployees);
    Collections.sort(listEmployees);
    System.out.println("After sorting: " + listEmployees);
}
 
    public static void reverse_order(){
        List<Integer> listIntegers = Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
        System.out.println("Before sorting: " + listIntegers);
        Collections.sort(listIntegers);
        System.out.println("After sorting: " + listIntegers);
        Collections.reverse(listIntegers);
        System.out.println("After reversing: " + listIntegers);
    }


    public static class Employee implements Comparable<Employee> {
        private String name;
        private int age;
        private int salary;
     
        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
     
        // getters and setters
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
        
        public int getSalary() {
            return salary;
        }
        
        @Override
        public String toString() {
            return String.format("(%s, %d, %d)", name, age, salary);
        }
        
        @Override
        public int compareTo(Employee other) {
            return this.name.compareTo(other.name);
        }
    }

    public static class EmployeeAgeComparator implements Comparator<Employee> {
     
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getAge() - emp2.getAge();
        }
    }
}