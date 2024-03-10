package TrainJob;

public class Main1 {
    public static void main(String[] args) {

        int result = 1;
        int f = 5;
        for(int i=1;i<=f;i++){
            result*=i;
        }
        System.out.println(result);

        System.out.println(factorial(0));
    }

    static int factorial (int x){
       if(x<=0){
           throw new ArithmeticException("Значение меньше 0");
       }
        int result = 1;
        for(int i=1;i<=x;i++){
            result*=i;
        }
        return result;
    }
}
