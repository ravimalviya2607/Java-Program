import java.util.*;
public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(7);
        ad1.add(9);
        ad1.addFirst(10);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
