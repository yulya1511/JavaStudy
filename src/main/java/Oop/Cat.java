package Oop;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeVoice (){
        System.out.println("Мася мяу-мяу");
    }

    @Override
    public void eat (){
        System.out.println("Мася жрет свои сухарики");
    }

    @Override
    public String getDescription (){
        return "Жирная, злая, никого не любит";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
