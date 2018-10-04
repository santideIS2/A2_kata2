package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = new int[] {1, 3, 5, -1, 3, -5, 1, -3, -5, 1, 2, 3, 4, 5, 1};
        
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        histogr.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        });
    }
}
