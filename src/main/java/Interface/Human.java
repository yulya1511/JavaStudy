package Interface;

public class Human implements Activable {

    private int stamina = 10;
    private boolean active = true;



    @Override
    public void run() {
        stamina-=2;
        if (stamina>=0){
            System.out.println("Человек бежит");
        }else{
            System.out.println("Человек не бежит");
            this.active = false;
        }

    }

    @Override
    public void jump() {
        stamina -= 2;
        if (stamina >= 0) {
            System.out.println("Человек прыгает");
        } else {
            System.out.println("Человек не прыгает");
            this.active = false;
        }

    }

    @Override
    public boolean isActive() {
        return active;
    }
}
