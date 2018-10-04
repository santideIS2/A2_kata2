package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;

    public T[] getData() {
        return data;
    }

    public Histogram(T[] data) {
        this.data = data;
    }
    public Map getHistogram(){
        Map<T, Integer> histogram = new HashMap<>();
        for (T i : data) {
            histogram.put(i,histogram.containsKey(i) ? histogram.get(i)+ 1 : 1);
        } 
        return histogram;
    }
}
