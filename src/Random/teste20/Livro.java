package teste20;

import java.util.*;

public class Livro extends Produto {
    
    private Set<Autor> autores;
   
    private String titulo;
    
    public Livro(String titulo, double preco) {
        super("L", preco);
        this.titulo = titulo;
        this.autores = new TreeSet<Autor>();
    }

    public Set<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Set<Autor> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void add(Autor autor) {
        this.autores.add(autor);
    }
    
    public String numeroAutores() {
        return Integer.toString(autores.size());
    }
    
    @Override
    public double precoVendaAoPublico() {
        return 0;
    }

    

    

    


}
