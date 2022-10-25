import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Integer> dll = new ArrayList<Integer>();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        dll.add(50);
        dll.add(60);
        System.out.println("For Each Method:");
        for (Integer a : dll) {// foreach
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Iterator Method:");
        Iterator<Integer> it = dll.iterator();// after adding all elements we need to declare it
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
