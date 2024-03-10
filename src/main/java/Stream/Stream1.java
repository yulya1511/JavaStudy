package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Пока");
        list.add("Ок");
        list.add("Как дела?");

//            for (int i=0; i<list.size();i++){
//                list.set(i, String.valueOf(list.get(i).length())); //до Стринга кастим, потому что в скобках инт
//            }
//        System.out.println(list); // метод нахождения длины

        List<Integer> list2 = list.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(list2);

        int[]array = {3,9,8,16,2}; // пример с массиовом
        array = Arrays.stream(array).map(e -> {if (e%3==0){
        e =e/3;
        }
        return e;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>(); // сохранит естественный порядок СЕТ ТРИСЕТ
        set.add("Привет");
        set.add("Пока");
        set.add("Ок");
        set.add("Как дела?");
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList()); // можем преобразовать в лист,
        // или в другие коллекции, тогда потеряется упорядеченность
        System.out.println(set2);
        System.out.println(list3);
    }


}
