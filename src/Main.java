public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        Circle s2 = new Circle();
        s2.setFilled(true);
        s2.setColor("green");
        s2.setRadius(10);
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        Shape s4 = new Square(6.6);

        System.out.println(s1.getClass().getSimpleName() + " 1:");
        System.out.println(s1);
        System.out.println("area: " + s1.getArea());
        System.out.println("perimetro: " + s1.getPerimeter());
        System.out.println();

        System.out.println(s2.getClass().getSimpleName() + " 2:");
        System.out.println(s2);
        System.out.println("area: " + s2.getArea());
        System.out.println("perimetro: " +s2.getPerimeter());
        System.out.println();

        System.out.println(s3.getClass().getSimpleName() + " 3:");
        System.out.println(s3);
        System.out.println("area: " + s3.getArea());
        System.out.println("perimetro: " +s3.getPerimeter());
        System.out.println();

        System.out.println(s4.getClass().getSimpleName() + " 4:");
        System.out.println(s4);
        System.out.println("area: " + s4.getArea());
        System.out.println("perimetro: " + s4.getPerimeter());
        System.out.println();

    }
}
