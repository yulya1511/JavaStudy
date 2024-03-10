package Stream;

import java.util.Arrays;

public class StreamCheck {
    public static void main(String[] args) {

        int[] array = {15, 7, 3, 8, 9};
        System.out.println(Arrays.toString(array));

        for (int i: array){
            System.out.println(i); // просто вывод на экран в столбик
        }
        System.out.println(" ");
        changeOfNumber(array);
        System.out.println(" ");

        int summ = 0;
        for (int value : array) {
            summ += value;
        }
        System.out.println(summ); //находим сумму первый способ
        System.out.println(" ");
        for (int i=0; i<array.length; i++){
            summ += array[i];
        }
        System.out.println(summ); // второй способ

        int sum = Arrays.stream(array).sum();
        System.out.println(sum); // третий способ

        int sum1 = Arrays.stream(array).reduce((a,e) -> a+e).getAsInt();
        System.out.println(sum1); // четвертый способ






        System.out.println(" ");
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.println(i /= 3);
            } else {
                System.out.println(i);
            }
        }
    }

    static void changeOfNumber(int[] ar) {
        for (int i : ar) {
            if (i % 2 == 0) {
                System.out.println(i /= 2);
            } else {
                System.out.println("Не делится на 2");
                ;
            }
        }
    }

}
