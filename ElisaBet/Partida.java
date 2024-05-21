import java.util.Date;

public class Partida {
    private Date dataHora;
    private Equipe equipe1;
    private Equipe equipe2;
    private String resultado;

        
    
    public Partida(Date dataHora, Equipe equipe1, Equipe equipe2) {
        this.dataHora = dataHora;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.resultado = "indefinido";
    }



    public Date getDataHora() {
        return dataHora;
    }



    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    


    public Equipe getEquipe1() {
        return equipe1;
    }



    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }



    public Equipe getEquipe2() {
        return equipe2;
    }



    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }



    public String getResultado() {
        return resultado;
    }



    public void setResultado(String resultado) {
        this.resultado = resultado;
    }



    @Override
    public String toString() {
        return " [equipe 1 =" + equipe1 + ", equipe 2= " + equipe2 + ", Data e Hora =" + dataHora + ", resultado" + resultado + "]";
    }
 }