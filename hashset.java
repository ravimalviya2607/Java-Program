import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashset = new HashSet<>(6,0.5f);
        myHashset.add(6);
        myHashset.add(8);
        myHashset.add(9);
        myHashset.add(25);
        myHashset.add(25);
        System.out.println(myHashset);
    }
}
