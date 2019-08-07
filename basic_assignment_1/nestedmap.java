import java.util.*;
public class nestedmap {
    private Map<Float, Map<Float, Integer>> hashX;
    // ...
    public void doublePut(Float one, Float two, Integer value) {
        if (hashX.get(one) == null) {
            hashX.put(one, new HashMap<Float, Integer>());
        }
      hashX.get(one).put(two, value);
    }
}
