package Oop;

import java.util.Arrays;

public class MainEmployee {

    public static void main(String[] args) {

       Employee[] employees = new Employee[6];
       employees[0] = new Employee("Lena", 26);
        employees[1] = new Employee("Zhenya", 35);
        employees[2] = new Employee("Andrey", 58);
        employees[3] = new Employee("Irina", 58);
        employees[4] = new Employee("Yuliya", 26);
        employees[5] = new Employee("Lesha", 40);

        System.out.println(Arrays.toString(employees)); // это 3 задание просто выводим информацию в консоль с помощью ToString
        System.out.println("-------"); // пробел просто для наглядности в консоли

        for (Employee e: employees) {
            System.out.println(e); // выводим инфу в консоль с помощью форич, выводит в столбик всех сотрудников
        }
            System.out.println("-------"); // пробел для наглядности
            ageOver40(employees,40); // вызываем метод и выводим сотрудников кому больше 40 лет

        System.out.println("-------");
        MainEmployee mainEmployee = new MainEmployee();
        //mainEmployee.testEmployee(employees, new ageOverr40());

        mainEmployee.testEmployee(employees, s -> s.age<30);
        mainEmployee.testEmployee(employees, p -> p.name == "Lena");




    }

    public static void ageOver40 (Employee [] e1, int age){ //создаем метод чтоб вывести сотрудников, кому больше 40 лет
        for (Employee e2: e1){
            if (e2.age>age){
                System.out.println(e2);
            }
        }

    }
//    public static class ageOverr40 implements CheckEmployee{
//        @Override
//        public boolean check(Employee e) {
//            return e.age>40 ;
//        }
//    }

    interface CheckEmployee {
        boolean check (Employee e);
    }

    void testEmployee (Employee[] e2, CheckEmployee checkEmployee){
        for (Employee emp: e2){
            if(checkEmployee.check(emp)){
                System.out.println(emp);
            }
        }
    }


}
