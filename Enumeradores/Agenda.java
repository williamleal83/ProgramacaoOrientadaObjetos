public class Agenda {

    // Utilizando o enum DiaDaSemana
    private DiaDaSemana dia;

    // Construtor
    public Agenda(DiaDaSemana dia) {
        this.dia = dia;
    }

    // Método para verificar se o dia é fim de semana ou dia útil
    public void verificarTipoDeDia() {
        switch (dia) {
            case SABADO:
            case DOMINGO:
                System.out.println("É fim de semana!");
                break;
            default:
                System.out.println("É dia útil.");
        }
    }
}
