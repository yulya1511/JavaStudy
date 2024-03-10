package CollectionTrain;

import Oop.Person;

import java.util.ArrayList;

//Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
// искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
// (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны

public class TaskGikBrains2 {

    public static void main(String[] args) {
        ArrayList<PhoneBook> arrayList = new ArrayList<>();
        PhoneBook person1 = new PhoneBook("Глухих", 227090);
        PhoneBook person2 = new PhoneBook("Котов", 388876);
        PhoneBook person3 = new PhoneBook("Гришина", 995467);
        PhoneBook person4 = new PhoneBook("Лопухова", 638926);
        PhoneBook person5 = new PhoneBook("Сидорова", 267456);
        PhoneBook person6 = new PhoneBook("Глухих", 225544);

        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        arrayList.add(person4);
        arrayList.add(person5);

        System.out.println(arrayList);




    }

    static class PhoneBook {
        String surname;
        int numberOfPhone;

        public PhoneBook(String surname, int numberOfPhone) {
            this.surname = surname;
            this.numberOfPhone = numberOfPhone;
        }

        @Override
        public String toString() {
            return "PhoneBook{" +
                    "surname='" + surname + '\'' +
                    ", numberOfPhone=" + numberOfPhone +
                    '}';
        }
    }
}
