package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        Integer[] data = {1, 3, 5, -1, 3, -5, 1, -3, -5, 1, 2, 3, 4, 5, 1};
        
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogr = histo.getHistogram();
        
//        for(Map.Entry<Integer, Integer> entry : histogr.entrySet()){
//            System.out.println(entry.getKey() + " ==> " + entry.getValue());
//        }
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));            
        }
    }
}
