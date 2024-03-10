package Interface;

public class Wall implements Passable {

    @Override
    public void pass(Activable a) {
        a.jump();
    }
}
