package Stream;


import java.util.Arrays;

public class Stream3 {
    public static void main(String[] args) {
        int[] array = {4,5,7,8};

        Arrays.stream(array).forEach(e1 -> {e1*=2;
            System.out.println(e1);});
        Arrays.stream(array).forEach (Utils::MyMethod); // метод реферанс, ссылка на метод
        Arrays.stream(array).forEach (e2 -> Utils.MyMethod(e2));// точно такое же написание только через лямбду
    }

}

class Utils{
    public  static  void MyMethod (int a){
        a = a+5;
        System.out.println("Выводим " + a);
    }
}
