package Interface;

public class TreadMill implements Passable{

    @Override
    public void pass(Activable a) {
        a.run();
    }
}
