import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStr = Arrays.asList("Maria", "Joaquina", "Cirilo");
        printList(myStr);

        // List<?> list = new ArrayList<Integer>();
        // list.add(3); // erro de compilação
    }

    public static void printList(List<?> list) {
        // list.add(3); Erro de compilação, o compilador não sabe qual é o tipo
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}