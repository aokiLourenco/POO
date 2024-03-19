package aulas.aula6.ex1;

import aulas.aula5.ex1.Date;

public class Pessoa {
    private String name;
    private int cc;
    private Date dataNasc;
    
    public Pessoa(String name, int cc, Date dataNasc) {
        this.name = name;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "name=" + name + ", cc=" + cc + ", dataNasc=" + dataNasc + '}';
    }

    @Override
    public int hashCode() {
        return name.hashCode() + cc + dataNasc.hashCode();
    } 
}


