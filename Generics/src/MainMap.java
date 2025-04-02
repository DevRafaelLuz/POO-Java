import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "João");
        map.put(2, "Maria");
        map.put(3, "Anna");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
