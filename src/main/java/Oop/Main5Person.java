package Oop;

public class Main5Person {
    public static void main(String[] args) {

        Person mam = new Person();

        Person dad = new Person("Андрей", 58);
        System.out.println(mam);
        System.out.println(dad);

        mam.talk(" Мама ");
        dad.talk("Папа");




    }





}
