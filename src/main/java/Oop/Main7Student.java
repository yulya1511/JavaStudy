package Oop;

import java.util.Arrays;

public class Main7Student {
    public static void main(String[] args) {

        Student[]guga = new Student[2];
        guga[0] = new Student("Лена", "Глухих", 364, 4.5);
        guga[1] = new Aspirant("Юля", "Глухих", 164, 5.0, "есть");

//        for (int i = 0; i < guga.length; i++);
        System.out.println(Arrays.toString(guga));
//        System.out.println();

        guga[0].Salary();
        guga[1].Salary();

    }

}
