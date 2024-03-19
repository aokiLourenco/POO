package Hmmmmm2;

import java.util.*;

public class Gastronomia extends Atividade{
    private List<Restaurante> restaurantes = new ArrayList<Restaurante>();

    public Gastronomia(int id, String nome, List<Restaurante> restaurantes) {
        super(id, nome);
        for(Restaurante restaurante : restaurantes){
            this.restaurantes.add(restaurante);
        }
    }

    public Gastronomia(int id, String nome) {
        super(id, nome);
    }

    public List<Restaurante> getLista() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void add(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }

    public int totalRestaurantes() {
        return restaurantes.size();
    }

    @Override
    public Collection<String> locais() {
        Collection<String> locais = new ArrayList<String>();
        for(Restaurante restaurante : restaurantes) {
            locais.add(restaurante.toString());
        }
        return locais;
    }
}
