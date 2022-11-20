import java.util.HashMap;

public class Task1 {

    public static void main(String[] args) {
        TextDictionary text = new TextDictionary();
        System.out.println(text.getLettersCount("Bye-Bye"));
        System.out.println(text.getLettersCount("Hello"));
    }
}

class TextDictionary {
        private String alphabet = "abcdefghijklmnopqrstuvwxyz";
        private HashMap<String, Integer> map;

        TextDictionary() {
            this.map = new HashMap<String, Integer>();
            for (String ch : alphabet.split("")) {
                this.map.put(ch, 0);
            }
        }

        public Object getLettersCount(String text) {
            for (String ch : text.split("")) {
                String key = ch.toLowerCase();
                if (this.map.containsKey(key)) {
                    this.put(key, this.getValueByKey(key) + 1);
                }
            }

            Object result = map.clone();
            this.cleanMap();
            return result;
        }

        private void put(String key, Integer value) {
            this.map.put(key, value);
        }

        private Integer getValueByKey(String key) {
            return this.map.get(key);
        }

        private void cleanMap() {
            this.map.replaceAll((k, v) -> 0);
        }

}
