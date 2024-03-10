package Oop;

public class Bear extends Animal {

    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeVoice (){
        System.out.println("Медведь рычит");
    }

    @Override
    public void eat (){
        System.out.println("Все, что найдет в лесу");
    }

    @Override
    public String getDescription (){
        return "Большой, злой и голодный";
    }

    @Override
    public String toString() {
        return "Bear{" +
                "name='" + name + '\'' +
                '}';
    }
}
