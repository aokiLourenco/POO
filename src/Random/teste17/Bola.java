package teste17;

public class Bola extends ObjetoMovel {
    private Cor cor;
    static int bola = 0;

    public Bola(Cor cor) {
        this.cor = cor;
        getnBolas();
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public static int getnBolas() {
        bola += 1;
        return bola;
    }

    public static void setBola(int bola) {
        Bola.bola = bola;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
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
        Bola other = (Bola) obj;
        if (cor != other.cor)
            return false;
        return true;
    }

}
