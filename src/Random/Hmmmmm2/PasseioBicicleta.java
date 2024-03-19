package Hmmmmm2;

import java.util.*;

public class PasseioBicicleta extends Atividade {
    private SortedSet<String> locais = new TreeSet<>();

    public PasseioBicicleta(int id, String nome, String[] locais) {
        super(id, nome);
        for(String local : locais) {
            this.locais.add(local);
        }
    }

    public PasseioBicicleta(int id, String nome) {
        super(id, nome);
    }

    public SortedSet<String> getLocais() {
        return locais;
    }

    public void setLocais(SortedSet<String> locais) {
        this.locais = locais;
    }

    public void addLocal(String local) {
        this.locais.add(local);
    }

    @Override
    public Collection<String> locais() {
        return locais;
    }
    
}
