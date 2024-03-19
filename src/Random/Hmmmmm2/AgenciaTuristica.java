package Hmmmmm2;

import java.util.*;

public class AgenciaTuristica {
    private Set<Atividade> atividades;
    
    private String nome, endereco;

    public AgenciaTuristica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.atividades = new HashSet<Atividade>();
    }

    public Set<Atividade> atividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void add(Atividade atividade) {
        this.atividades.add(atividade);
    }

    public int totalItems() {
        int i = 0;
        for(Atividade a : atividades) {
            i += a.locais().size();
        }
        return i;
    }

    public List<String> getAllItems() {
        List<String> i = new ArrayList<String>();
        for(Atividade a : atividades) {
            for(String s : a.locais()) {
                i.add(s);
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return nome + "\n\tAtividades:" + atividades.toString();
    }

}
