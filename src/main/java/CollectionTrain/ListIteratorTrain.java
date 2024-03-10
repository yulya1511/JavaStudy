package CollectionTrain;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTrain {
    public static void main(String[] args) {
        String s = "madam2";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isP = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isP = false;
                break;

            }

        }
        if (isP) {
            System.out.println("P");
        } else {
            System.out.println("NP");
        }
    }
}
