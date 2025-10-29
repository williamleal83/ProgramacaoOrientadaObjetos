package TratamentoExcecoes;
import java.util.Scanner;

// Este código NÃO POSSUI tratamento de erros.
public class ExemploSemTratamentoErro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vect;
        int opcao = 0;
        int posicao = 0;

        do {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1 - Informar os nomes");
            System.out.println("2 - Sair");

            // Lê a opção do menu
            opcao = sc.nextInt();

            // Consome o "\n" (Enter) pendente
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Digite os nomes separados por espaco.");
                vect = sc.nextLine().split(" ");

                System.out.println("Digite a posicao do nome.");
                posicao = sc.nextInt();

                // Imprime o nome na posição escolhida
                System.out.println("Nome: " + vect[posicao]);

                // Limpa o buffer de entrada para evitar um loop infinito no catch
                sc.nextLine();
            }

            // O loop continua ENQUANTO a opção for diferente de 2
        } while (opcao != 2);

        System.out.println("Final do programa.");
        sc.close();
    }
}
