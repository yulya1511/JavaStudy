package lesson1;

import java.util.Scanner;

public class ScannerTrain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("В каком году ты родился?");
        int a = sc.nextInt();
        System.out.println("Здорово! Да ты молодой еще!");
        System.out.println("У тебя есть собака? Введи 1 если есть, введи 0  если нет");
        int dog = sc.nextInt();
        if (dog == 1){
            System.out.println("Great");
        } else if (dog == 0){
            System.out.println("I see");
        }
    }
}

