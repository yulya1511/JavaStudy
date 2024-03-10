package lesson1;

import java.util.Arrays;

public class Lesson24 {
    public static void main(String[] args) {

        /* Создать квадратный двумерный целочисленный массив
        (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
        диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
        то есть [0][0], [1][1], [2][2], ..., [n][n];
         */

        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j || i + j == arr4[i].length - 1){
                    arr4 [i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(arr4));


//        arr4[0][0] = 1;
//        arr4[1][0] = 5;
//        arr4[2][0] = 1;
//        arr4[0][1] = 7;
//        arr4[1][1] = 1;
//        arr4[2][1] = 6;
//        arr4[0][2] = 1;
//        arr4[1][2] = 3;
//        arr4[2][2] = 1;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//
//            }
//            System.out.println();
//        }
        //System.out.println(Arrays.deepToString(arr4));
    }


}
//int [][] arr4 = new int[3][3];
//arr4 [0][0] = 1;
//arr4 [1][0] = 5;
//arr4 [2][0] = 4;
//arr4 [0][1] = 7;
//arr4 [1][1] = 1;
//arr4 [2][1] = 6;
//arr4 [0][2] = 9;
//arr4 [1][2] = 3;
//arr4 [2][2] = 1;
//System.out.println(Arrays.deepToString(arr4));

// }
// }

