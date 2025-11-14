import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        // Unbounded wildcard
        List<Integer> listaInteiros = Arrays.asList(5, 2, 10);
        imprimirLista(listaInteiros);

        List<String> myStr = Arrays.asList("Maria", "Joaquina", "Cirilo");
        imprimirLista(myStr);

        // Upper bounded wildcard
        List<Double> listaDoubles = Arrays.asList(1.5, 2.0, 3.7);
        System.out.println("Soma dos números: " + somarNumeros(listaDoubles));

        // Lower bounded wildcard
        List<Integer> listaInteiros2 = new ArrayList<>();
        adicionarInteiros(listaInteiros2);
        imprimirLista(listaInteiros2);

        // List<?> list = new ArrayList<Integer>();
        // list.add(3); // erro de compilação
    }

    // Unbounded wildcard
    public static void imprimirLista(List<?> list) {
        // list.add(3); Erro de compilação, o compilador não sabe qual é o tipo
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // Upper bounded wildcard
    public static double somarNumeros(List<? extends Number> lista) {
        double soma = 0;
        for (Number n : lista) {
            soma += n.doubleValue();
        }
        return soma;
    }

    // Lower bounded wildcard
    public static void adicionarInteiros(List<? super Integer> lista) {
        lista.add(10);
        lista.add(20);
    }
}