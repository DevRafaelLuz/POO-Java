import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws Exception {
        var list1 = new ArrayList<Integer>();

        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(2);

        System.out.println("Size: " + list1.size());

        // list1.remove(Integer.valueOf("3"));
        list1.remove(2);
        // list1.clear();

        list1.forEach(value -> { System.out.println(value); });

        var elemento = obterPrimeiroElemento(list1);
        System.out.println("Elemento: " + elemento);
        
        for (int value : list1) {
            System.out.println(value);
        }
    }

    private static <T> T obterPrimeiroElemento(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new NoSuchElementException("Lista está vazia!");
        }
        return lista.get(0);
    }
}
