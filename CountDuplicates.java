import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 4, 4, 4, 5 };
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        for (int num : array) {
            if (elementCountMap.containsKey(num)) {
                elementCountMap.put(num, elementCountMap.get(num) + 1);
                elementCountMap.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
