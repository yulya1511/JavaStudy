package Interview;

// Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//препятствия. Результатом выполнения действия будет печать в консоль. (Например,
//dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
//кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.

 public abstract class AnimalOOP {

     public String name;
     public int runLength;
     public int swimLength;

     public AnimalOOP(String name, int runLength, int swimLength) {
         this.name = name;
         this.runLength = runLength;
         this.swimLength = swimLength;
     }

     @Override
     public String toString() {
         return "AnimalOOP{" +
                 "name='" + name + '\'' +
                 ", runLength=" + runLength +
                 ", swimLength=" + swimLength +
                 '}';
     }

     public void run (int length) {
         if (this.runLength - length >=0){
             System.out.println(name + " пробежал " + length + " метров ");
         }else {
             System.out.println(name + " не пробежал");
         }
     }

     public void swim (int length) {
         if (this instanceof CatOOP){
             System.out.println("Кошары не умеют плавать");
             return;
         }
         if (this.swimLength - length >=0){
             System.out.println(name + " проплыл " + length + " метров ");
         }else {
             System.out.println(name + " не проплыл");
         }
     }


 }
