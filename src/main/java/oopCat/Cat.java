package oopCat;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat (Plate plate){
        System.out.println(name + " Кушает." + " Нужно еды " + this.appetite);
        this.full = plate.getFoodFromPlate(this.appetite);
        if (this.full){
            System.out.println(name + " Покушал");
        }else {
            System.out.println(name + " Остался голодным");
        }
        plate.info();
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }
}
