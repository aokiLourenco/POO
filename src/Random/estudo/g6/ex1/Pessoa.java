package estudo.g6.ex1;

import estudo.g5.ex1.Date;

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
        return "Pessoa [Nome: " + name + ", Data de Nascimento: " + dataNasc + ", CC: " + cc + "]";
    }


    @Override
    public int hashCode() {
        return name.hashCode() + cc + dataNasc.hashCode();
    }
}
