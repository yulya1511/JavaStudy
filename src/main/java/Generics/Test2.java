package Generics;

public class Test2 {
    public static void main(String[] args) {
        info <String> info1 = new info<>( "привет");
        System.out.println(info1);

        String s = info1.getValue();

        info <Integer> info2 = new info<>( 18);
        System.out.println(info2);

        Integer integer = info2.getValue();
    }
}

class info <T>{
    private T value;
    public info(T value){
        this.value = value;
    }

    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue (){
        return value;
    }

        }