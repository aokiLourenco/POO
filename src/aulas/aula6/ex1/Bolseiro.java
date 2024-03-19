package aulas.aula6.ex1;

import aulas.aula5.ex1.Date;

public class Bolseiro extends Aluno {

    private float valorBolsa;

    public Bolseiro(String name, int cc, Date dataNasc, float valorBolsa) {
        super(name, cc, dataNasc);
        this.valorBolsa = valorBolsa;
    }

    public float getBolsa() {
        return valorBolsa;
    }

    public void setBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public String toString() {
        return "Bolseiro{" + "valorBolsa=" + valorBolsa + '}';
    }
}
