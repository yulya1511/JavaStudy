package CollectionTrain;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Yulya");
        arrayList1.add("Lena");
        arrayList1.add("Zhenya");
        System.out.println(arrayList1);
        System.out.println(arrayList1.size());

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);
        arrayList1.clear();
        System.out.println(arrayList1);
    }
}
