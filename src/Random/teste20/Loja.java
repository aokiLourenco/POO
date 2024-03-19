package teste20;

import java.util.*;

public class Loja {
    private SortedSet<Produto> stock = new TreeSet<>();
    
    private String nome, enderecoWeb;

    public Loja(String nome, String enderecoWeb) {
        this.nome = nome;
        this.enderecoWeb = enderecoWeb;
    }

    public SortedSet<Produto> getStock() {
        return stock;
    }

    public void setStock(SortedSet<Produto> stock) {
        this.stock = stock;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoWeb() {
        return enderecoWeb;
    }

    public void setEnderecoWeb(String enderecoWeb) {
        this.enderecoWeb = enderecoWeb;
    }
    
    

}
