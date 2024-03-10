package TrainJob;

import java.util.ArrayList;

public class MainPupils {
    public static void main(String[] args) {

        Pupils[]pupils = new Pupils[4];
        pupils[0] = new Student("Ваня", 28, 8.5,5);
        pupils[1]= new Student("Лена", 27, 8.0,4);
        pupils[2] = new Schooler("Юля", 15, 5.0, 10);
        pupils[3] = new Schooler("Дима", 13, 4.0, 8);

//        for(Pupils p: pupils){
//            System.out.println(p);
//        }

        System.out.println("-----");

        pupils[0].study();
        System.out.println("-----");
        ArrayList<Pupils> pupils1 = new ArrayList<>();
        pupils1.add(pupils[0]);
        pupils1.add(pupils[1]);
        pupils1.add(pupils[2]);
        pupils1.add(pupils[3]);

        for(Pupils pupils2: pupils1){
            System.out.println(pupils2);
        }


    }
}
