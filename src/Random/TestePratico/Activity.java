package TestePratico;

public class Activity {
    private int preco;
    private Client client;
    
    public Activity(int preco, Client client) {
        this.preco = preco;
        this.client = client;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
