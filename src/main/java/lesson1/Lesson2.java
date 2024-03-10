package lesson1;

/* Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {


        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;


            }

        }
        System.out.println(Arrays.toString(arr1));


        task2();
    }

    /* Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */

    public static void task2() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));

    }
}


