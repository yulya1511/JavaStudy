package CollectionTrain;

//Создайте класс Pet и его наследников Cat, Dog, Parrot.
//Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
//Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExamCloudsTask9 {
    public static void main(String[] args) {
        Pet pet1 = new Cat("Кошка", 5, "Британия");
        Pet pet2 = new Cat("Кошка", 6, "Россия");
        Pet pet3 = new Cat("Котенок", 1, "Италия");
        Pet pet4 = new Dog("Щенок", 1, "Москва");
        Pet pet5 = new Dog("Собака", 4, "Воронеж");
        Pet pet6 = new Dog("Собака", 10, "Екатеринбург");
        Pet pet7 = new Parrot("Попугай", 2, "Красно-черный");
        Pet pet8 = new Parrot("Попугай", 1, "Красно-желтый");
        Pet pet9 = new Parrot("Попугай", 1, "Оранжевый");

        Map<String, Pet> pets = new HashMap<>();
        pets.put("Масечка", pet1);
        pets.put("Кеша", pet2);
        pets.put("Боня", pet3);
        pets.put("Шерлок", pet4);
        pets.put("Шери", pet5);
        pets.put("Молли", pet6);
        pets.put("Асенчик", pet7);
        pets.put("Пупсик", pet8);
        pets.put("Чирик", pet9);

        for(Map.Entry<String, Pet> entry: pets.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());//выводим с помощью цикла все ключи и значения
        }

        System.out.println("\n");

        getKey(pets);//выводим с помощью метода только ключи

    }

    public static void getKey (Map<String, Pet> Pet){
        for (Map.Entry<String, Pet> entry: Pet.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}

 class Pet{
    String typeOfPet;
    int age;

     public Pet(String typeOfPet, int age) {
         this.typeOfPet = typeOfPet;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Pet{" +
                 "typeOfPet='" + typeOfPet + '\'' +
                 ", age=" + age +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Pet pet = (Pet) o;
         return age == pet.age &&
                 Objects.equals(typeOfPet, pet.typeOfPet);
     }

     @Override
     public int hashCode() {
         return Objects.hash(typeOfPet, age);
     }
 }



 class Cat extends Pet{

    String country;

     public Cat(String typeOfPet, int age, String country) {
         super(typeOfPet, age);
         this.country = country;
     }
 }

class Dog extends Pet{

    String city;

    public Dog(String typeOfPet, int age, String city) {
        super(typeOfPet, age);
        this.city = city;
    }
}

class Parrot extends Pet{

    String colour;

    public Parrot(String typeOfPet, int age, String colour) {
        super(typeOfPet, age);
        this.colour = colour;
    }
}
