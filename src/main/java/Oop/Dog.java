package Oop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeVoice (){
        System.out.println("Шерлок Гав-Гав");
    }

    @Override
    public void eat (){
        System.out.println("Шерлок просит все со стола");
    }

    @Override
    public String getDescription (){
        return "Добрый, красивый, верный";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
