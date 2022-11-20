import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
    class GenericCollection<V> {

    public Collection<V> getCollectionWithoutDuplicates (Collection<V> collection) {
        HashMap<V, V> map = new HashMap();

        for(V val: collection) {
            map.put(val, val);
        }

        return map.values();
    }
}
public class Task2 {

  public static void main(String[] args) {
      Collection<String> strList = new ArrayList<String>();
      strList.add("Mariia");
      strList.add("olena");
      strList.add("Mariia");
      strList.add("mariia");
      GenericCollection<String> genColStr = new GenericCollection<String>();
      System.out.println(genColStr.getCollectionWithoutDuplicates(strList));

      Collection<Integer> numList = new ArrayList<Integer>();
      numList.add(null);
      numList.add(0);
      numList.add(0);
      numList.add(1);
      GenericCollection<Integer> genColNum = new GenericCollection<Integer>();
      System.out.println(genColNum.getCollectionWithoutDuplicates(numList));
    }
}