package estudo.g6.ex1;

import estudo.g5.ex1.Date;

public class Bolseiro extends Aluno{
    
    private float bolsa;

    public Bolseiro(String name, int cc, Date dataNasc, float bolsa) {
        super(name, cc, dataNasc);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolseiro [Valor da bolsa: " + bolsa + "]";
    }

    
}
