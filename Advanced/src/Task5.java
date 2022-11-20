import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Task5 {
    static <K, V> Map<K, V> getMappedArrays(ArrayList<K> keys, ArrayList<V> values) {
        TreeMap<K, V> sortedMap = new TreeMap<K, V>();

        for (int i=0; i <= keys.size() - 1; i++) {
            if(i > values.size() - 1) {
                sortedMap.put(keys.get(i), null);
            } else {
                sortedMap.put(keys.get(i), values.get(i));
            }
        }

        return sortedMap;
    }

    public static void main(String[] args) {
        ArrayList<String> keysArray = new ArrayList<String>();
        keysArray.add("mama");
        keysArray.add("papa");
        keysArray.add("daughter");
        keysArray.add("son");
        ArrayList<Integer> valuesArray = new ArrayList<Integer>();
        valuesArray.add(30);
        valuesArray.add(30);
        valuesArray.add(8);
        valuesArray.add(5);
        Map<String, Integer> sortedMap = Task5.getMappedArrays(keysArray, valuesArray);

        System.out.println(sortedMap);
    }
}
