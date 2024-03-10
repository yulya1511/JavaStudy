package Stream;


import java.util.Arrays;

public class Stream5 {
    public static void main(String[] args) {
        int [] arr = {3,6,7,3,9,4,6,2,3,1,14,18,39,52,25};
       arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr)); // сравнение интов, джава знает как сравнивать инты
    }

    // как сравнивать студентов написано в тетради
}
