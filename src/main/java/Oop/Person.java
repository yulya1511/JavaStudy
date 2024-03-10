package Oop;

public class Person {

    public String full_name;
    public int age;

    public Person () {
    }

    public Person(String full_name, int age) {
        this.full_name = full_name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "full_name='" + full_name + '\'' +
                ", age=" + age +
                '}';
    }

    public void talk (String full_name){
        System.out.println(full_name + " говорит");



    }

}
