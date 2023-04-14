public class Circle extends TwoDShape{

    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    public String toString(){
        return "This is a circle with radius " + radius + ".";
    }
}
