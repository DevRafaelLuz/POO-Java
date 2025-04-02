import java.util.HashSet;

public class MainSet {
    public static void main(String[] args) {
        var list1 = new HashSet<Integer>();

        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(2);

        System.out.println("Size: " + list1.size());

        list1.remove(2);
        // list1.clear();

        list1.forEach(value -> { System.out.println(value); });

        for (int value : list1) {
            System.out.println(value);
        }
    }
}
