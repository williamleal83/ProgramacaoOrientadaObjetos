public class Programa {
    public static void main(String[] args) {
        // Criando uma instância de Agenda com um dia da semana
        Agenda agenda1 = new Agenda(DiaDaSemana.SEGUNDA);
        agenda1.verificarTipoDeDia(); // É dia útil.

        // Conversão de Enum para String
        DiaDaSemana dia = DiaDaSemana.valueOf("SEGUNDA");
        System.out.println("Dia convertido: " + dia); // Dia convertido: SEGUNDA

        // Criando uma instância de Agenda com um dia do fim de semana
        Agenda agenda2 = new Agenda(DiaDaSemana.DOMINGO);
        agenda2.verificarTipoDeDia(); // É fim de semana!

        // Conversão de Enum para String
        DiaDaSemana dia2 = DiaDaSemana.valueOf("DOMINGO");
        System.out.println("Dia convertido: " + dia2); // Dia convertido: DOMINGO
    }
}
