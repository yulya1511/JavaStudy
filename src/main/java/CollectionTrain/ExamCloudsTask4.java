package CollectionTrain;

//Напишите методы union(Set<?>... set) и intersect(Set<?> ... set), реализующих
// операции объединения и пересечения множеств.
// Протестируйте работу этих методов на предварительно заполненных множествах.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ExamCloudsTask4 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(10);
        set1.add(18);
        set1.add(23);
        set1.add(57);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(11);
        set2.add(19);
        set2.add(23);
        set2.add(57);

        HashSet<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

    }


}
