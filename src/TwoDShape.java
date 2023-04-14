public abstract class TwoDShape {
    public double width;
    public double height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape() {
        width = 0;
        height = 0;
    }

    /* this function is used to calculate the area of the 2d shape

     */
    public abstract double getArea();

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract String toString();
}
