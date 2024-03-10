package Oop;

public abstract class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeVoice (){
        System.out.println("Звуки животного");
    }

    public void eat (){
        System.out.println("Чем питается животное");
    }

    public String getDescription (){
        return "Описание животного";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
