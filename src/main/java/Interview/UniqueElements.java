package Interview;

import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        String[] array = {"privet", "poka", "privet", "ok", "yes", "poka", "no", "privet"};
        repeatWords(array);

    }

    static void repeatWords(String[] array) {
        Set<String> distinct = new HashSet<>();
        Map<String, List<Integer>> result = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (distinct.add(array[i])) {
                result.put(array[i], new LinkedList<>());
                result.get(array[i]).add(i);
            } else {
                result.get(array[i]).add(i);
            }
        }
        result.forEach((k, v) -> {
            if (v.size() > 1) {
                System.out.println(k + " = " + v);
            }
        });
    }
}





