package Stream;


import java.util.Arrays;
import java.util.List;

public class CheckJob {
    public static void main(String[] args) {
        String [] array = {"привет", "пока", "привет", "окей", "окей", "привет"};

        Arrays.stream(array).distinct().forEach(e-> System.out.println(e));

        List<String> list = moveArrayToList(array);
        System.out.println(list);


    }

    public static <T> List<T> moveArrayToList (T array[]){
        List<T> list = Arrays.asList(array);
        return list;
    }
}
