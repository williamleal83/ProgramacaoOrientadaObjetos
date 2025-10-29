import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExemploComFinally {
	public static void main(String[] args) {

		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;

		try {
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			// getMessage() - retorna a descrição do erro - é útil para depuração e para
			// armazenar logs
			System.out.println("Error opening file: " + e.getMessage());

			// Imprime o stack trace do erro, ou seja, o caminho percorrido dentro no código
			// até chegar a origem da exceção - é útil para depuração e para armazenar logs
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}