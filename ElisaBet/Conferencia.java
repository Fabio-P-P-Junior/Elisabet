import java.util.ArrayList;
import java.util.List;

public class Conferencia {
    private List<Partida> partidas;
    private List<Aposta> apostas;

    public Conferencia() {
        this.partidas = new ArrayList<>();
        this.apostas = new ArrayList<>();
    }

    public void adicionarPartida(Partida partida) {
        partidas.add(partida);
    }

    public void adicionarAposta(Aposta aposta) {
        if (aposta.getCliente().retirarSaldo(aposta.getValor())) {
            apostas.add(aposta);
        } else {
            System.out.println("Saldo insuficiente para realizar a aposta.");
        }
    }

    public void conferirResultados() {
        for (Aposta aposta : apostas) {
            if (aposta.getPartida().getResultado().equals(aposta.getEquipe().getNomeEquipe())) {
                aposta.setVencedor(true);
                aposta.getCliente().adicionarSaldo(aposta.getValor() * 2);
            }
        }
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public List<Aposta> getApostas() {
        return apostas;
    }
}
