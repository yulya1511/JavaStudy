package Oop;

public class Main4 {
    public static void main(String[] args) {

        Phone iphone = new Phone("227090", "iphone 14", 100.5f);

        Phone samsung = new Phone("227595", "Galaxy", 105.2f);

        Phone nokia = new Phone("227898", "Nokia 9560", 96.8f);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
        iphone.recieveCall("Юля");
        samsung.recieveCall("Лена");
        nokia.recieveCall("Степа");
        System.out.println(iphone.getNumber());
        System.out.println(samsung.getNumber());
        System.out.println(nokia.getNumber());
        iphone.recieveCall("Юля", "227090");
        samsung.recieveCall("Лена", "227595");
        nokia.recieveCall("Степа", "227898");

//        Phone.sendMassage();









    }
}
