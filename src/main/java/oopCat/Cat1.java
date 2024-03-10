package oopCat;

public class Cat1 {

    private String name;
    private int appetite;
    private boolean full;

    public Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void eat (Plate1 plate1){
        System.out.println(name + " Кушает." + " Нужно еды " + this.appetite);
        this.full = plate1.getFoodFromPlate(this.appetite);
        if(this.full){
            if (this.full){
                System.out.println(name + " Покушал");
            }else {
                System.out.println(name + " Остался голодным");
            }
            plate1.info();
        }
        }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
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
