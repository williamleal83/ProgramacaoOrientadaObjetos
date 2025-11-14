import javax.print.PrintService;

public class Programa {

    public static void main(String[] args) {

        // Sem Generics
        System.out.println("--- Sem Generics ---");
        ImprimirInteiro printer = new ImprimirInteiro(20);

        System.out.println("Impressao do numero inteiro:");
        System.out.println(printer.getInteiroParaImprimir());

        System.out.println("------------------------------");

        ImprimirDouble printer2 = new ImprimirDouble(5.0);

        System.out.println("Impressao do numero double:");
        System.out.println(printer2.getDoubleParaImprimir());

        System.out.println("------------------------------");

        // Com Generics
        System.out.println("--- Com Generics ---");
        Impressao<Double> printer3 = new Impressao<>(20.00);

        System.out.println("Impressao de alguma coisa:");
        System.out.println(printer3.getAlgoParaImprimir());

        System.out.println("------------------------------");

        Impressao<Integer> printer4 = new Impressao<>(150);

        System.out.println("Impressao de alguma coisa:");
        System.out.println(printer4.getAlgoParaImprimir());

        Impressao<String> printer5 = new Impressao<>("Generics em Java");

        System.out.println("Impressao de alguma coisa:");
        System.out.println(printer5.getAlgoParaImprimir());

        System.out.println("------------------------------");

        // Com Bounded Generics
        System.out.println("--- Calculadora com Bounded Generics ---");
        // Usando com Integer
        Calculadora<Integer> calcInt = new Calculadora<>(10);
        System.out.println("Dobro de 10 = " + calcInt.dobro());

        // Usando com Double
        Calculadora<Double> calcDouble = new Calculadora<>(7.5);
        System.out.println("Dobro de 7.5 = " + calcDouble.dobro());

        // Usando com Long
        Calculadora<Long> calcLong = new Calculadora<>(100L);
        System.out.println("Dobro de 100 = " + calcLong.dobro());

        // Lista Genérica
        System.out.println("--- Lista Genérica ---");
        ImpressaoLista<Integer> listaInteiro = new ImpressaoLista<>();

        int n = 10;

        for (int i = 0; i < n; i++) {
            listaInteiro.adicionaValor(i);
        }

        listaInteiro.imprimir();
        Integer x = listaInteiro.primeiro();
        System.out.println("Ultimo: " + x);

    }
}
