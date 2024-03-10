package CollectionTrain;

import java.util.*;

//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.

public class TaskGikBrains1 {
    public static void main(String[] args) {
        String[] array = {"Юля", "Лена", "Дима", "Степа", "Миша", "Степа", "Миша", "Дима", "Дима", "Миша"};
        Set<String> set = new HashSet<>(Arrays.asList(array));
        Map<String, Integer> map1 = new HashMap<>();

        for (String s : set) {
            map1.put(s, 0);
            for (String name : array) {
                if (s.equals(name)) {
                    map1.put(s, map1.get(s) + 1);

                }
            }
        }
        System.out.println(map1);


        System.out.println(set);

    }


}
