public class Circle extends Shape {
    public double radius;

    public Circle(){
        super();
    }

    public Circle(double radius){
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (getRadius() * 2);
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + getRadius() + "]";
    }
}
