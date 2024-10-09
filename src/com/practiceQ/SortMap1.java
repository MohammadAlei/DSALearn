import java.util.*;

public class SortMap1 {
    public static void main(String[] args) {
        System.out.println("Hi");
        List<Integer> intList = new ArrayList<>();
         HashMap<Integer, String> map = new HashMap<>();

        // Hardcoded key-value pairs
        map.put(23, "Apple");
        map.put(23, "Berry");
        map.put(45, "Banana");
        map.put(12, "Orange");
        map.put(67, "Grapes");
        map.put(89, "Mango");
        map.put(34, "Peach");
        map.put(56, "Strawberry");
        map.put(91, "Pineapple");
        map.put(10, "Watermelon");
        map.put(78, "Cherry");

        map.forEach((k,v) -> {System.out.println(v);
            intList.add(k);
        });
        Collections.sort(intList);
        intList.forEach(el -> System.out.println(el));

//      Sort Map using key
        List<Map.Entry<Integer , String>> sortMap = new ArrayList<>(map.entrySet());
        sortMap.sort(Map.Entry.<Integer,String>comparingByKey());
        sortMap.forEach(System.out :: println);

//      Sort Map using key

        Map<Integer , String> tm = new TreeMap<>(map);
        System.out.println(tm);

//         import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.stream.Collectors;

// public class SortHashMapByValue {
//     public static void main(String[] args) {
//         // Create a HashMap with some hardcoded values
//         HashMap<Integer, String> map = new HashMap<>();
//         map.put(23, "Apple");
//         map.put(45, "Banana");
//         map.put(12, "Orange");
//         map.put(67, "Grapes");
//         map.put(89, "Mango");
//         map.put(34, "Peach");
//         map.put(56, "Strawberry");
//         map.put(91, "Pineapple");
//         map.put(10, "Watermelon");
//         map.put(78, "Cherry");

//         // Sort the HashMap by values
//         Map<Integer, String> sortedMap = map.entrySet()
//             .stream()
//             .sorted(Map.Entry.comparingByValue())
//             .collect(Collectors.toMap(
//                 Map.Entry::getKey, 
//                 Map.Entry::getValue, 
//                 (e1, e2) -> e1, // Merge function
//                 LinkedHashMap::new // Preserve insertion order
//             ));

//         // Print the sorted map
//         System.out.println("Sorted HashMap by values:");
//         sortedMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
//     }
// }






//     }
}
}