import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BackwardIterator {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            ll.add(i + 1);
        }
        int total = ll.size();
        ListIterator<Integer> it = ll.listIterator(total);
        System.out.println("List In Backward Using listIterator");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println("");
    }
}
