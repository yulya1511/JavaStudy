package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List list = new ArrayList(); //ротайп , нет парамтра
        list.add("Привет");
        list.add("пока");
        list.add("работка");
        list.add("учеба"); //не можем добавить объект сюда

        for (Object o: list){ // выводим на экран, если нет опред параметра то это объект
            System.out.println(o + " длина " + ((String)o).length());// кастим до стринга посл выражение
        }

    }
}
