package RegexTrain;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

    public static void main(String[] args) {

//        String s1 = "A pirate was a 156789 bandit who sailed the seas in search of 37 ships carrying valuable things";
//        Pattern pattern1 = Pattern.compile("\\D+");
//        Matcher matcher1 = pattern1.matcher(s1);
//
//        while (matcher1.find()) {
//            System.out.println(matcher1.group());
//        }
//
//        int age = 26;
//        String name = "Julia";
//        float weight = 56.0f;
//        System.out.printf("Name: %s \t Age: %d \t Weight: %.2f", name, age, weight);



//    String myPhone = "+79315341304";
//    boolean check = myPhone.matches("\\+\\d{11}");
//
//    if(check){
//        System.out.println("Телефон соответсвует шаблону");
//    }else {
//        System.out.println("Телефон введен не по шаблону");
//    }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер. 11 цифр и перед "+" ");
        String number = scanner.nextLine();
        boolean check1 = number.matches("\\+\\d{11}");
        if(check1){
            System.out.println("Телефон принят");
        }else {
            System.out.println("Телефон введен неверно");
        }



}
}
