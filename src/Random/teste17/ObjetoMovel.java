package teste17;

public class ObjetoMovel {
    private int x;
    private int y;
    private int velocidade;
    private double  distancia;
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void move(int newX, int newY){
        setDistancia(distancia(newX, newY));
        setX(newX);
        setY(newY); 
    }
    public void move(int newX, int newY, int velocidade){
        setDistancia(distancia(newX, newY));
        setX(newX);
        setY(newY);
        setVelocidade(velocidade);
    }

    public double distancia(int x, int y){
        double distancia;
        distancia= Math.sqrt(Math.pow(getY()-y, 2)+Math.pow(getX()-x,2 ));
        return distancia;
    }

}
