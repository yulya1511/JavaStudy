package CollectionTrain;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add("Yulya");
        arrayList1.add("Lena");
        arrayList1.add("Zhenya");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);

    }
}
