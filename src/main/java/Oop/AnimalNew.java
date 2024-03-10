package Oop;

public abstract class AnimalNew {
    public String name;
    public int runLength;
    public int swimLength;


    public AnimalNew(String name, int runLength, int swimLength) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    protected void run(int length) {
        if (this.runLength - length >= 0) {
            System.out.println(name + " пробежал " + length + " метров");
        } else {
            System.out.println(name + " не может столько пробежать: " + length);
            System.out.println("Остаток выносливости на бег: " + this.runLength);
        }
    }

    protected void swim(int length) {
        if (this instanceof CatNew) {
            System.out.println("Кошки не умеют плавать");
            return;
        }
        if (this.swimLength - length >= 0) {
            System.out.println(name + " проплыл " + length + " метров");
        } else {

            System.out.println(name + " не может столько проплыть: " + length);
            System.out.println("Остаток выносливости на плавание: " + this.swimLength);

        }

    }


    public static void sayHello (AnimalNew a){
        System.out.println("Привет " + a.name);

    }


}
