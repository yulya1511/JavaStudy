package codewars;


public class WelcometoTheCity {
    public String sayHello(String[] name, String city, String state) {
        String hello = "Hello, ";
        for (String str : name) {
            hello = hello + " " + str;
        }
        return String.format("%s! Welcome to %s, %s!", hello, city, state);


    }

}





