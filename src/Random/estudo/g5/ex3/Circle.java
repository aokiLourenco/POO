package estudo.g5.ex3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(!valid(radius)){
            throw new IllegalArgumentException("Radius must be positive!");
        }
        this.radius = radius;
    }

    public boolean valid(int radius){
        if(this.radius>0){
            return true;
        } else{
            return false;
        }
    }

    public double circleArea(){
        return Math.PI * radius * radius;
    }

    public double cilclePerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    
}

