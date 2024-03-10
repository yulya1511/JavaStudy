package lesson1;

import java.util.Arrays;

// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
public class Lesson23 {
    public static void main(String[] args) {
int [] myArray = task3();
        System.out.println(Arrays.toString(myArray));

    }

    public static int[] task3 (){
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int key = 0; key < arr3.length; key++) {
            if (arr3[key] < 6) {
                arr3[key] *= 2;
            }
        }
        return arr3;

    }

}

