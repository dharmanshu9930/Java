

import java.util.PriorityQueue;

class Games implements Comparable<Games> {
    private int Cost;
    private String Name;

    public Games(int Cost, String Name) {
        this.Cost = Cost;
        this.Name = Name;
    }

    @Override
    public String toString() {
        return Name + " " + Cost;
    }

    @Override
    public int compareTo(Games o) {
        return this.Cost - o.Cost;
    }
}

public class PriorityQueueMain {
    public static void main(String[] args) {
        Games a = new Games(100, "Spider-Man");
        Games b = new Games(200, "Avengers");
        PriorityQueue<Games> gg = new PriorityQueue<Games>();
        gg.offer(b);
        gg.offer(a);
        System.out.println(gg);
        System.out.println(gg.size());
        System.out.println(gg.peek());

    }
}