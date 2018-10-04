package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Map<Integer, Integer> histogram = new HashMap<>();
        int[] data;
        data = new int[] {1, 3, 5, -1, 3, -5, 1, -3, -5, 1, 2, 3, 4, 5, 1};
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else {
                histogram.put(data[i], 1);
            }
        }
        histogram.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        });
    }
}
