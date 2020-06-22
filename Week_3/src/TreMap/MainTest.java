package TreMap;

import java.util.Map;
import java.util.TreeMap;

public class MainTest {
    public static void main(String[] args) {
        Map<String, Integer> newMap = new TreeMap<String, Integer>();
        String string = "Chương trình sử dụng một TreeMap để lưu trữ,một mục bao gồm một từ và số lượng của nó";
        String[] words = string.toUpperCase().split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replace(',', ' ');
            words[i] = words[i].replace('.', ' ');
            words[i] = words[i].replace('?', ' ');
            words[i] = words[i].replace('!', ' ');
            String key = words[i];
            if (newMap.containsKey(key)) {
                newMap.put(key, newMap.get(key) + 1);
            } else
                newMap.put(key, 1);
        }
        System.out.println(newMap);
    }
}
