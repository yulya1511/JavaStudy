package Oop;

public class Vet  {
    public void treatAnimal (Animal animal){
        System.out.println(animal.name);
        System.out.println(animal.getDescription());

    }
     public static void safe (Animal a){
         System.out.println("Hello " + a.name);


     }


}
