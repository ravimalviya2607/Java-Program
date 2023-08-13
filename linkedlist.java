import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(10);
        l2.add(15);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,8);
        l1.add(0,1);
        l1.addAll(0,l2);
        l1.addLast(201);
        l1.addFirst(45);
        System.out.println(l1.contains(20));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
//        l1.addAll(l2);
        l1.set(1,566);
        for(int i = 0; i< l1.size(); i++){
            System.out.print(l1.get(i) +", ");

        }
    }
}
