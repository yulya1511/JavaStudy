package Error;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckLoginAndPassword {

    public static void main(String[] args) {

        CheckLoginAndPassword checkLoginAndPassword = new CheckLoginAndPassword();

        try {
            privateInfo();
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }

    }

    public static void privateInfo () throws WrongLoginException, WrongPasswordException{

        Scanner scanner = new Scanner(System.in);
        System.out.println("First step");
        System.out.println("login: (Use only english letters or numbers or underscore)");
        String loginOfUser = scanner.nextLine();

        boolean resultLogin = loginOfUser.matches("(\\w){0,20}");
            if (!resultLogin){
            throw new WrongLoginException("Symbols are incorrect");
        }else {
            System.out.println("Second step");
        }

        System.out.println("Password: (Use only english letters or numbers or underscore)");
        String passwordOfUser = scanner.nextLine();

        boolean resultPassword = passwordOfUser.matches("(\\w){0,20}");
        if (resultPassword == false){
            throw new WrongPasswordException("Symbols are incorrect");
        }else {
            System.out.println("Next step");
        }

        System.out.println("Confirm Password");
        String confirmPasswordOfUser = scanner.nextLine();

        boolean resultConfirmPassword = confirmPasswordOfUser.matches("(\\w){0,20}");
        if (resultConfirmPassword == false || (!passwordOfUser.equals(confirmPasswordOfUser))){
            throw new WrongPasswordException("Symbols or confirmation of password are incorrect");
            } else {
            System.out.println("Welcome to system");
        }
    }

}
