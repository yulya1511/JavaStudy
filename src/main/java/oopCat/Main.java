package oopCat;

public class Main {
    public static void main(String[] args) {

        Cat[]cats = new Cat[4];
        cats[0] = new Cat("Мася",10);
        cats[1] = new Cat("Кеша",50);
        cats[2] = new Cat("Мурзя",40);
        cats[3] = new Cat("Кузя",30);

        Plate plate = new Plate(120);

        for (Cat c: cats){
            c.eat(plate);
        }


    }
}
