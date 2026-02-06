import java.util.*;

public class main {
    public static void main(String[] args) {
        
        // Task 1: Create a new map and display the values using HashMap, LinkedHashMap, and TreeMap
        System.out.println("===== Task 1: Creating and Displaying Maps =====\n");
        
        // HashMap example
        Map<Integer, String> mapHttpErrors = new HashMap<>();
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");
        System.out.println("HashMap: " + mapHttpErrors);
        
        // LinkedHashMap example
        Map<String, String> mapContacts = new LinkedHashMap<>();
        mapContacts.put("0169238175", "Tom");
        mapContacts.put("0904891321", "Peter");
        mapContacts.put("0945678912", "Mary");
        mapContacts.put("0981127421", "John");
        System.out.println("LinkedHashMap: " + mapContacts);
        
        // TreeMap example
        Map<String, String> mapLang = new TreeMap<>();
        mapLang.put(".c", "C");
        mapLang.put(".java", "Java");
        mapLang.put(".pl", "Perl");
        mapLang.put(".cs", "C#");
        mapLang.put(".php", "PHP");
        mapLang.put(".cpp", "C++");
        mapLang.put(".xml", "XML");
        System.out.println("TreeMap: " + mapLang);
        
        // Task 2: Perform basic operations on a map
        System.out.println("\n===== Task 2: Basic Operations =====\n");
        
        Map<Integer, String> mapHttpErrors2 = new HashMap<>();
        mapHttpErrors2.put(400, "Bad Request");
        mapHttpErrors2.put(304, "Not Modified");
        mapHttpErrors2.put(200, "OK");
        mapHttpErrors2.put(301, "Moved Permanently");
        mapHttpErrors2.put(500, "Internal Server Error");
        
        // get()
        String status301 = mapHttpErrors2.get(301);
        System.out.println("get(301): " + status301);
        
        // containsKey()
        if (mapHttpErrors2.containsKey(200)) {
            System.out.println("containsKey(200): Http status 200 exists");
        }
        
        // containsValue()
        if (mapHttpErrors2.containsValue("OK")) {
            System.out.println("containsValue(\"OK\"): Found status OK");
        }
        
        // remove()
        String removedValue = mapHttpErrors2.remove(500);
        if (removedValue != null) {
            System.out.println("remove(500): Removed value - " + removedValue);
        }
        
        // replace()
        System.out.println("Map before replace: " + mapHttpErrors2);
        mapHttpErrors2.replace(304, "No Changes");
        System.out.println("Map after replace(304, \"No Changes\"): " + mapHttpErrors2);
        
        // size()
        int size = mapHttpErrors2.size();
        System.out.println("size(): " + size);
        
        // isEmpty()
        if (mapHttpErrors2.isEmpty()) {
            System.out.println("isEmpty(): Map is empty");
        } else {
            System.out.println("isEmpty(): Map has HTTP Errors");
        }
        
        // Task 3: Iterating over elements in a Map using keySet(), values(), and entrySet()
        System.out.println("\n===== Task 3: Iterating over Map Elements =====\n");
        
        Map<String, String> mapCountryCodes = new HashMap<>();
        mapCountryCodes.put("1", "USA");
        mapCountryCodes.put("44", "United Kingdom");
        mapCountryCodes.put("33", "France");
        mapCountryCodes.put("81", "Japan");
        
        // Using keySet()
        System.out.println("Using keySet():");
        Set<String> setCodes = mapCountryCodes.keySet();
        Iterator<String> iterator = setCodes.iterator();
        while (iterator.hasNext()) {
            String code = iterator.next();
            String country = mapCountryCodes.get(code);
            System.out.println(code + " => " + country);
        }
        
        // Using values()
        System.out.println("\nUsing values():");
        Collection<String> countries = mapCountryCodes.values();
        for (String country : countries) {
            System.out.println(country);
        }
        
        // Using entrySet()
        System.out.println("\nUsing entrySet():");
        Set<Map.Entry<String, String>> entries = mapCountryCodes.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String code = entry.getKey();
            String country = entry.getValue();
            System.out.println(code + " => " + country);
        }
        
        // Using forEach()
        System.out.println("\nUsing forEach():");
        mapCountryCodes.forEach((code, country) -> System.out.println(code + " => " + country));
        
        // Task 4: Perform bulk operations with Maps (clear() and putAll())
        System.out.println("\n===== Task 4: Bulk Operations =====\n");
        
        // clear()
        System.out.println("Before clear: " + mapHttpErrors2);
        mapHttpErrors2.clear();
        System.out.println("After clear: " + mapHttpErrors2);
        System.out.println("Is map empty? " + mapHttpErrors2.isEmpty());
        
        // putAll()
        Map<Integer, String> countryCodesEU = new HashMap<>();
        countryCodesEU.put(44, "United Kingdom");
        countryCodesEU.put(33, "France");
        countryCodesEU.put(49, "Germany");
        
        Map<Integer, String> countryCodesWorld = new HashMap<>();
        countryCodesWorld.put(1, "United States");
        countryCodesWorld.put(86, "China");
        countryCodesWorld.put(82, "South Korea");
        
        System.out.println("Before putAll: " + countryCodesWorld);
        countryCodesWorld.putAll(countryCodesEU);
        System.out.println("After putAll: " + countryCodesWorld);
        
        // Task 5: Create a TreeMap mapping movie names to ratings, sorted in descending order
        System.out.println("\n===== Task 5: TreeMap with Movie Ratings (Descending Order) =====\n");
        
        // Create a map with movie ratings
        Map<String, Double> movieRatingsUnsorted = new LinkedHashMap<>();
        movieRatingsUnsorted.put("Inception", 8.8);
        movieRatingsUnsorted.put("The Shawshank Redemption", 9.3);
        movieRatingsUnsorted.put("The Dark Knight", 9.0);
        movieRatingsUnsorted.put("Pulp Fiction", 8.9);
        movieRatingsUnsorted.put("Forrest Gump", 8.8);
        
        // Sort by rating value in descending order using TreeMap with custom Comparator
        Map<String, Double> sortedMovieRatings = new TreeMap<>(
            Comparator.comparingDouble((String movie) -> movieRatingsUnsorted.get(movie)).reversed()
        );
        sortedMovieRatings.putAll(movieRatingsUnsorted);
        
        System.out.println("Movie Ratings (Sorted by Rating in Descending Order):");
        sortedMovieRatings.forEach((movie, rating) -> 
            System.out.println(movie + " => " + rating)
        );
    }
}
