package CollectionTrain;
//Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
// Перебрать и распечатать пары значений - entrySet().
// Перебрать и распечатать набор из имен продуктов  - keySet().
// Перебрать и распечатать значения продуктов - values().
// Для каждого перебора создать свой метод.


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExamCloudsTask7 {

    public static void main(String[] args) {
        Product product1 = new Product("Big", 15000);
        Product product2 = new Product("Small", 5000);
        Product product3 = new Product("Avarage", 12000);
        Product product4 = new Product("Huge", 16000);
        Product product5 = new Product("Tiny", 2000);
        Map<String, Product> Toys = new HashMap<>();
        Toys.put("Cat", product1);
        Toys.put("Dog", product2);
        Toys.put("Bear", product3);
        Toys.put("Eagle", product4);
        Toys.put("Mouse", product5);

        System.out.println(Toys);//просто выводим
        System.out.println("\n");
        for (HashMap.Entry<String, Product> entry : Toys.entrySet()) { // выводим с помощью цикла
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println("\n");
        for (HashMap.Entry<String, Product> entry1 : Toys.entrySet()) { //печатаем ключи
            System.out.println(entry1.getKey());
        }
        System.out.println("\n");
        for (HashMap.Entry<String, Product> entry1 : Toys.entrySet()) { //печатаем значения
            System.out.println(entry1.getValue());
        }
        showEntrySet(Toys);




    }

    public static void showEntrySet(Map<String, Product> toys) {
        System.out.println(toys);


    }

    static class Product {
        String size;
        int price;

        public Product(String size, int price) {
            this.size = size;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "size='" + size + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return price == product.price &&
                    Objects.equals(size, product.size);
        }

        @Override
        public int hashCode() {
            return Objects.hash(size, price);
        }
    }


}




