package Generics;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Джулька");
        arrayList.add("Ленка");
        arrayList.add("Женька");
        String s = GenMethods.getElement(arrayList);
        System.out.println(s);
        System.out.println(GenMethods.getElement(arrayList));


    }

}

class GenMethods{

    public static <T>T getElement (ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
