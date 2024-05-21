import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "joao@gmail.com", 100.0);
        Equipe equipe1 = new Equipe("Equipe A", "Cidade A");
        Equipe equipe2 = new Equipe("Equipe B", "Cidade B");
        Partida partida1 = new Partida(new Date(), equipe1, equipe2);

        Conferencia conferencia = new Conferencia();
        conferencia.adicionarPartida(partida1);

        Aposta aposta1 = new Aposta(cliente1, partida1, equipe1, 50.0);
        conferencia.adicionarAposta(aposta1);

        partida1.setResultado("Equipe A");
        conferencia.conferirResultados();
        System.out.println(cliente1);
    }
}
