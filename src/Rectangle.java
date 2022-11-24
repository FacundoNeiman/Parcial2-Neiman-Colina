public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(){
        super();
    }

    public Rectangle(double width, double length){
        super();
        setLength(length);
        setWidth(width);
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        setLength(length);
        setWidth(width);
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return (getLength() * 2 ) + (getWidth() * 2);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + getWidth() + ", length=" + getLength() + "]";
    }
}
