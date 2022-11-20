import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static <K, V> Map<V, Collection<K>> substituteKeyAndValueInMap(Map<K, V> map) {
        HashMap<V, Collection<K>> newMap = new HashMap<>();

        map.forEach((K key, V value) -> {
            if (newMap.containsKey(value)) {
                Collection<K> collectionOfKeys = newMap.get(value);
                collectionOfKeys.add(key);
            } else {
                Collection<K> keysCollection = new ArrayList<K>();
                keysCollection.add(key);
                newMap.put(value, keysCollection);
            }
        });
        return newMap;
    }

    public static void main(String [] args) {
        HashMap<String, Integer> testMap = new HashMap<String, Integer>();
        testMap.put("mariia", 32);
        testMap.put("olena", 32);
        testMap.put("marko", 27);
        System.out.println(Task3.substituteKeyAndValueInMap(testMap));
    }
}
