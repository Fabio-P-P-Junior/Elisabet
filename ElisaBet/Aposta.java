public class Aposta {
    private Cliente cliente;
    private Partida partida;
    private Equipe equipe; 
    private Double valor;
    private boolean vencedor;
    
    public Aposta(Cliente cliente, Partida partida, Equipe equipe, Double valor) {
        this.cliente = cliente;
        this.partida = partida;
        this.equipe = equipe;
        this.valor = valor;
        this.vencedor = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isVencedor() {
        return vencedor;
    }

    public void setVencedor(boolean vencedor) {
        this.vencedor = vencedor;
    }

    @Override
    public String toString() {
        return "Aposta [cliente=" + cliente + ", partida=" + partida + ", equipe=" + equipe + ", valor=" + valor
                + ", vencedor=" + vencedor + "]";
    }
}