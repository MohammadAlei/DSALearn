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

    }
}
