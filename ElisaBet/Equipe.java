public class Equipe {

    private String nomeEquipe;
    private String cidade;

    public Equipe(String nomeEquipe, String cidade) {
        this.nomeEquipe = nomeEquipe;
        this.cidade = cidade;
    }

    public String getNomeEquipe() {

        return nomeEquipe;

    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Equipe [nome =" + nomeEquipe + ", cidade = " + cidade + "]";
    }
}
