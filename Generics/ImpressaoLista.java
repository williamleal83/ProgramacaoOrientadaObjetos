import java.util.ArrayList;
import java.util.List;

public class ImpressaoLista<T> {

	private List<T> list = new ArrayList<>();

	public void adicionaValor(T value) {
		list.add(value);
	}

	public T primeiro() {
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista está vazia!");
		}
		return list.getLast();
	}

	public String imprimir() {
		String lista = "[";

		if (!list.isEmpty()) {
			lista += list.get(0);
			for (int i = 1; i < list.size(); i++) {
				lista += ", " + list.get(i);
			}
		}

		lista += "]";
		return lista;
	}
}