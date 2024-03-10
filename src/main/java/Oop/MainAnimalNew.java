package Oop;

import oopCat.Cat;

public class MainAnimalNew {
    public static void main(String[] args) {

        AnimalNew[]ans = new AnimalNew[4];
        ans[0] = new DogNew("Шерлок");
        ans[1] = new DogNew("Бим");
        ans[2] = new CatNew("Мася");
        ans[3] = new CatNew("Кешуня");


        ans[0].run(400);
        ans[0].swim(5);

        ans[1].run(600);
        ans[1].swim(15);

        ans[2].run(200);
        ans[2].swim(10);

        ans[3].run(100);
        ans[3].swim(0);

        int quantity = CatNew.count + DogNew.count;
        System.out.println(quantity + " животных создали в классе");


        System.out.println(CatNew.count + " кошек создали в классе");
        System.out.println(DogNew.count + " собак создали в классе");

        for (AnimalNew a: ans){
            AnimalNew.sayHello(a);
        }









    }


}

