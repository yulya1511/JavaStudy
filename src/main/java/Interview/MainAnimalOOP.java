package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAnimalOOP {

    public static void main(String[] args) {

        AnimalOOP [] animals = new AnimalOOP[6];
        animals[0] = new CatOOP("Мася");
        animals[1] = new CatOOP("Кеша");
        animals[2] = new DogOOP("Шерлок");
        animals[3] = new DogOOP("Лея");
        animals[4] = new DogOOP("Бим");
        animals[5] = new DogOOP("Молли");

        animals[0].run(200);
        animals[0].swim(20);
        System.out.println(" "); //пробел для наглядности

        animals[1].run(100);
        animals[1].swim(0);
        System.out.println(" ");

        animals[2].run(200);
        animals[2].swim(5);
        System.out.println(" ");

        animals[3].run(100);
        animals[3].swim(250);
        System.out.println(" ");

        animals[4].run(300);
        animals[4].swim(4);
        System.out.println(" ");

        animals[5].run(500);
        animals[5].swim(8);

        System.out.println("--------"); //пробел для наглядности

        for(AnimalOOP a: animals){
            System.out.println(a); //просто выводим на экран животных с помощью форич
        }

        System.out.println("--------");

        System.out.println(CatOOP.count + " кошек в нашем массиве");
        System.out.println(DogOOP.count + " собак в нашем массиве");
        int totalAnimal = CatOOP.count + DogOOP.count;
        System.out.println(totalAnimal + " всего животных в нашем массиве");

    }
}
