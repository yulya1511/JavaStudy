package lesson1;

import java.util.Arrays;

public class Lesson25 {
    public static void main(String[] args) {

        //Задать одномерный массив и найти в нем минимальный и максимальный элементы

        int[] arr5 = {1, 6, 8, 9, 1000, 12, 23, 2, 235};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++){
            if (min > arr5[i]) {
                min = arr5[i];
            }

            if (max < arr5 [i]){
                max = arr5[i];
            }
        }
        System.out.println(min + " " + max);


//        System.out.println(Arrays.toString(arr5));
//        Arrays.sort (arr5, 0, arr5.length);
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(arr5 [0]);
//        System.out.println(arr5 [arr5.length-1]);
    }

}
