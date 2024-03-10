package Oop;


import java.util.Arrays;

public class Phone {
    public String number;
    public String model;
    public float weight;

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone (){
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


    public void recieveCall (String name){
        System.out.println("Звонит " + name);

    }
    public void recieveCall (String name, String number){
        System.out.println("Звонит " + name + " c номера " + number);
    }
    public String getNumber (){
        return number;

    }
//    public static String[] sendMassage () {
//        java.lang.String[] nambers = {"227090", "227595"};
//        System.out.println(Arrays.toString(nambers));
//        return nambers;
//    }



}
