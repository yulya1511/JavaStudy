package Oop;

import java.util.Arrays;

public class MainAnimal {

    public static void main(String[] args) {

        Animal[]anims = new Animal[3];
        anims[0] = new Cat("Мася");
        anims[1] = new Dog("Шерлок");
        anims[2] = new Bear("Мишка Тэди");

        Vet vet = new Vet();
        for (Animal c: anims){
            vet.treatAnimal(c);
        }
        for (Animal a: anims){
            Vet.safe(a);
        }

        for (Animal a: anims){
            a.makeVoice();
            a.eat();
        }

//        anims[0].makeVoice();
//        anims[1].makeVoice();
//        anims[2].makeVoice();
//
//        anims[0].eat();
//        anims[1].eat();
//        anims[2].eat();
//
//        System.out.println(anims[0].getDescription());
//        System.out.println(anims[1].getDescription());
//        System.out.println(anims[2].getDescription());
//
//
//
//        System.out.println(Arrays.toString(anims));


    }





}
