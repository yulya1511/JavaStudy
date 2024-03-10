package lesson1;

import java. util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.println("Привет, " + name);
        System.out.println("Сколько тебе лет?");
        int age = scan.nextInt();
        System.out.println("ок, а кем работаешь?");
        String job = scan.nextLine();
        System.out.println(job);
        System.out.println("Вторым пилотом?");
        String da = scan.nextLine();
        System.out.println(da);
//         if ( da == true) {
            System.out.println("Понятно, здорово ");


        }


    }





