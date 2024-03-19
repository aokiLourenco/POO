package teste17;

public class Jogo {
    private Equipa equipa1;
    private Equipa equipa2;
    private Bola bola;
    private Tempo tempoTotal;
    private Tempo tempoDecorrido;
    
    public Jogo(Equipa equipa1, Equipa equipa2, Bola bola, Tempo tempoTotal, Tempo tempoDecorrido) {
        this.equipa1 = equipa1;
        this.equipa2 = equipa2;
        this.bola = bola;
        this.tempoTotal = tempoTotal;
        this.tempoDecorrido = tempoDecorrido;
    }

    public Jogo(Equipa equipa1, Equipa equipa2, Bola bola, int tempo) {
        this.equipa1 = equipa1;
        this.equipa2 = equipa2;
        this.bola = bola;
        this.tempoTotal = new Tempo(tempo);
    }

    public Equipa getEquipa1() {
        return equipa1;
    }

    public void setEquipa1(Equipa equipa1) {
        this.equipa1 = equipa1;
    }

    public Equipa getEquipa2() {
        return equipa2;
    }

    public void setEquipa2(Equipa equipa2) {
        this.equipa2 = equipa2;
    }

    public Bola getBola() {
        return bola;
    }

    public void setBola(Bola bola) {
        this.bola = bola;
    }

    public Tempo getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(Tempo tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public Tempo getTempoDecorrido() {
        return tempoDecorrido;
    }

    public void setTempoDecorrido(Tempo tempoDecorrido) {
        this.tempoDecorrido = tempoDecorrido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bola == null) ? 0 : bola.hashCode());
        result = prime * result + ((equipa1 == null) ? 0 : equipa1.hashCode());
        result = prime * result + ((equipa2 == null) ? 0 : equipa2.hashCode());
        result = prime * result + ((tempoDecorrido == null) ? 0 : tempoDecorrido.hashCode());
        result = prime * result + ((tempoTotal == null) ? 0 : tempoTotal.hashCode());
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
        Jogo other = (Jogo) obj;
        if (bola == null) {
            if (other.bola != null)
                return false;
        } else if (!bola.equals(other.bola))
            return false;
        if (equipa1 == null) {
            if (other.equipa1 != null)
                return false;
        } else if (!equipa1.equals(other.equipa1))
            return false;
        if (equipa2 == null) {
            if (other.equipa2 != null)
                return false;
        } else if (!equipa2.equals(other.equipa2))
            return false;
        if (tempoDecorrido == null) {
            if (other.tempoDecorrido != null)
                return false;
        } else if (!tempoDecorrido.equals(other.tempoDecorrido))
            return false;
        if (tempoTotal == null) {
            if (other.tempoTotal != null)
                return false;
        } else if (!tempoTotal.equals(other.tempoTotal))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Jogo entre "+ equipa1.getNome()+ " e "+ equipa2.getNome();
    }
    
}
