public class Cliente {
    private String nome;
    private String email;
    private double saldo;

    public Cliente(String nome, String email, double saldoInicial) {
        this.nome = nome;
        this.email = email;
        this.saldo = saldoInicial;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }

    public boolean retirarSaldo(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", email=" + email + ", saldo=" + saldo + "]";
    }
}
