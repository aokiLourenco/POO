package TestePratico;

public class Client {
    private String nome, localidade;

    public Client(String nome, String localidade) {
        this.nome = nome;
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Client:\n" + nome + " [" + localidade + "]";
    }

    

}
