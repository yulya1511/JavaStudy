package oopCat;

public class Main1 {

    public static void main(String[] args) {
        Cat1 []cats = new Cat1[4];
        cats[0] = new Cat1("Мася",10);
        cats[1] = new Cat1("Кеша",50);
        cats[2] = new Cat1("Мурзя",40);
        cats[3] = new Cat1("Кузя",30);

        Plate1 plate1 = new Plate1(120);

        for (Cat1 c: cats){
            c.eat(plate1);
        }


    }

}
