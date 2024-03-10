package lesson1;

import java.lang.reflect.Array;

public class Arrays {

    public static void main(String[] args) {

        String[] week = {"Пн", "Вт", "Ср", "Чт", "Пт", "Cб", "Вс"};
        System.out.println(week[6]);
        task3();
        task4();
       task5();
    }

    public static void task3() {
        String[][] arr = new String[3][6];
        arr[0][0] = "a1";
        arr[0][1] = "a2";
        arr[0][2] = "a3";
        arr[0][3] = "a4";
        arr[0][4] = "a5";
        arr[0][5] = "a6";
        arr[1][0] = "b1";
        arr[1][1] = "b2";
        arr[1][2] = "b3";
        arr[1][3] = "b4";
        arr[1][4] = "b5";
        arr[1][5] = "b6";
        arr[2][0] = "c1";
        arr[2][1] = "c2";
        arr[2][2] = "c3";
        arr[2][3] = "c4";
        arr[2][4] = "c5";
        arr[2][5] = "c6";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void task4() {
        int[][] arr1 = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
        System.out.println(java.util.Arrays.deepToString(arr1));
    }

    public static void task5(){
        int [][] arr2 = {{56,34,78,92,110,4,72,33},{2,-34,-45,560,38,44,3,8},{5,-34,-105,560,39,47,2,1}};
        int min = arr2[0][0];
        int max = arr2 [0][0];
        for(int i=0;i<arr2.length;i++){
            for(int j = 0;j<arr2[i].length;j++){
                if(min>arr2[i][j]){
                    min = arr2[i][j];
                }
                if (max<arr2[i][j]){
                    max = arr2[i][j];
                }
                System.out.print(max + " " + " " + min);

            }
            System.out.println();
        }
    }
}
