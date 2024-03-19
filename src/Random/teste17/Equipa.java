package teste17;

import java.util.*;

public class Equipa {
    private String nome;
    private String nomeResponsavel;
    private int totalGolosMarcados;
    private int totalGolosSofridos;
    private Set<Robo> robo = new HashSet<>();
    
    public Equipa(String nome, String nomeResponsavel) {
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
    }

    public Equipa(String nome, String nomeResponsavel, int totalGolosMarcados, int totalGolosSofridos, Set<Robo> robo) {
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
        this.totalGolosMarcados = totalGolosMarcados;
        this.totalGolosSofridos = totalGolosSofridos;
        this.robo = robo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public int getGolosMarcados() {
        int golos=0;
        for (Robo i:robo){
            golos += i.getGolos();
        }
        setGolosMarcados(golos);
        return golos;
    }

    public void setGolosMarcados(int totalGolosMarcados) {
        this.totalGolosMarcados = totalGolosMarcados;
    }

    public int getGolosSofridos() {
        return totalGolosSofridos;
    }

    public void setGolosSofridos(int totalGolosSofridos) {
        this.totalGolosSofridos = totalGolosSofridos;
    }

    public Set<Robo> getRobo() {
        return robo;
    }

    public void setRobos(Set<Robo> robos) {
        this.robo = robos;
    }
    
    public void add(Robo robo1){
        robo.add(robo1);
    }

    public void remove(Robo robo1){
        robo.remove(robo1);
    }

    public Robo[] getRobos() {
        Robo[] robos = new Robo[robo.size()];
        int i = 0;
        for (Robo r:robo){
            robos[i] = r;
            i++;
        }
        return robos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((nomeResponsavel == null) ? 0 : nomeResponsavel.hashCode());
        result = prime * result + ((robo == null) ? 0 : robo.hashCode());
        result = prime * result + totalGolosMarcados;
        result = prime * result + totalGolosSofridos;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipa other = (Equipa) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (nomeResponsavel == null) {
            if (other.nomeResponsavel != null)
                return false;
        } else if (!nomeResponsavel.equals(other.nomeResponsavel))
            return false;
        if (robo == null) {
            if (other.robo != null)
                return false;
        } else if (!robo.equals(other.robo))
            return false;
        if (totalGolosMarcados != other.totalGolosMarcados)
            return false;
        if (totalGolosSofridos != other.totalGolosSofridos)
            return false;
        return true;
    }

    @Override
    public String toString() {
        String f = robo.toString();
        f = f.replace("[", "").replace("]", "replacement");
        String result = "Equipa " + getNome()+", treinada por "+ getNomeResponsavel() + " (" + robo.size()+" jogadores)" + "\n robos= " + f + "\n golosMarcados=" + getGolosMarcados();
        
        return result;
    }
}
