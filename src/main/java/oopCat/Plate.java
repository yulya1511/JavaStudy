package oopCat;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean getFoodFromPlate (int countOfFood){
        if (this.food>countOfFood){
            this.food -= countOfFood;
            return true;
        }
        return false;
    }

    public void info (){
        System.out.println("Остаток еды: " + this.food);
    }
}