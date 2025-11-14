public class Calculadora<T extends Number> {

    private T numero;

    public Calculadora(T numero) {
        this.numero = numero;
    }

    public double dobro() {
        return numero.doubleValue() * 2;
    }
}
