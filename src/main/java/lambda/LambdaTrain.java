package lambda;

public class LambdaTrain {


    public static void main(String[] args) {
        Countable countable;
        countable = (x,y) -> x+y;

        System.out.println(countable.count(20,40));

    }

    interface Countable{
        int count(int x, int y);
    }
}
