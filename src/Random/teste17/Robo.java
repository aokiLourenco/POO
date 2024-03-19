package teste17;

public class Robo extends ObjetoMovel {
    private String id;
    private TipoJogador tipo;
    private int golos;
    
    
    // public Robo(String id, TipoJogador tipoJogador, int golos) {
    //     this.id = id;
    //     this.tipo = tipoJogador;
    //     this.golos = golos;
    // }

    public Robo(String id, TipoJogador tipoJogador, int newX, int newY) {
        this.id = id;
        this.tipo = tipoJogador;
        setX(newX);
        setY(newY);
    }

    

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    public TipoJogador getTipo() {
        return tipo;
    }



    public void setTipo(TipoJogador tipo) {
        this.tipo = tipo;
    }



    public int getGolos() {
        return golos;
    }



    public void setGolos(int golos) {
        this.golos = golos;
    }



    public void marcaGolo() {
        setGolos(getGolos() + 1);
    }
    
   
    @Override
    public String toString() {
        return ("id="+ getId() + ", tipo="+ getTipo() + " *;* ");
    }
}
