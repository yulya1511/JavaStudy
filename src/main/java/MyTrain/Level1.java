package MyTrain;

import java.util.Scanner;

public class Level1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int i = 0;
        System.out.println("Введите целое число");
        if (scan.hasNextInt()){ //возвр истину если с потока ввода можно считать целое число
        i = scan.nextInt(); //считаывает целое число с потока ввода и сохр в переменную
        if (i%2 == 0){
            System.out.println("Четное");
        }else{
            System.out.println("Ошибка.Ввели нечетное число");
        }
        }

        }
    }
