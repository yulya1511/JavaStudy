package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class StreamTrainArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 7, 8};
//        Arrays.stream(array).map(e->e*3).forEach(e-> System.out.println(e));
//        int a = Arrays.stream(array).reduce((e,s)->e*s).getAsInt();
//        System.out.println(a);
//        int a1 = Arrays.stream(array).min().getAsInt();
//        System.out.println(a1);
//        double d = Arrays.stream(array).average().getAsDouble();
//        System.out.println(d);
//        Arrays.stream(array).distinct().forEach(e-> System.out.println(e));
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println(list);
        Arrays.stream(array).filter(a->a>4).forEach(System.out::println);
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(stream(array).count());



    }


}
