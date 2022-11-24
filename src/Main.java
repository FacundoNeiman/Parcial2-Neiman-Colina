public class Main {
    public static void main(String[] args) {
        Circle s1 = new Circle(5.5, "red", false);
        Circle s2 = new Circle();
        s2.setFilled(true);
        s2.setColor("green");
        s2.setRadius(10);
        Rectangle s3 = new Rectangle(1.0, 2.0, "red", false);
        Square s4 = new Square(6.6);
        Square s5 = new Square();
        s5.setSide(2);
        s5.setColor("black");
        s5.setFilled(false);

        System.out.println(s1.getClass().getSimpleName() + " 1:");
        System.out.println(s1);
        System.out.println("- Color: " + s1.getColor());
        System.out.println("- Rellenado: " + s1.isFilled());
        System.out.println("- Radio: " + s1.getRadius());
        System.out.println("- Area: " + s1.getArea());
        System.out.println("- Perimetro: " + s1.getPerimeter());
        System.out.println();

        System.out.println(s2.getClass().getSimpleName() + " 2:");
        System.out.println(s2);
        System.out.println("- Color: " + s2.getColor());
        System.out.println("- Rellenado: " + s2.isFilled());
        System.out.println("- Radio: " + s2.getRadius());
        System.out.println("- Area: " + s2.getArea());
        System.out.println("- Perimetro: " +s2.getPerimeter());
        System.out.println();

        System.out.println(s3.getClass().getSimpleName() + " 3:");
        System.out.println(s3);
        System.out.println("- Color: " + s3.getColor());
        System.out.println("- Rellenado: " + s3.isFilled());
        System.out.println("- Largo: " + s3.getLength());
        System.out.println("- Ancho: " + s3.getWidth());
        System.out.println("- Area: " + s3.getArea());
        System.out.println("- Perimetro: " +s3.getPerimeter());
        System.out.println();

        System.out.println(s4.getClass().getSimpleName() + " 4:");
        System.out.println(s4);
        System.out.println("- Color: " + s4.getColor());
        System.out.println("- Rellenado: " + s4.isFilled());
        System.out.println("- Lado: " + s4.getSide());
        System.out.println("- Largo: " + s4.getLength());
        System.out.println("- Ancho: " + s4.getWidth());
        System.out.println("- Area: " + s4.getArea());
        System.out.println("- Perimetro: " +s4.getPerimeter());
        System.out.println();

        System.out.println(s5.getClass().getSimpleName() + " 5:");
        System.out.println(s5);
        System.out.println("- Color: " + s5.getColor());
        System.out.println("- Rellenado: " + s5.isFilled());
        System.out.println("- Lado: " + s5.getSide());
        System.out.println("- Largo: " + s5.getLength());
        System.out.println("- Ancho: " + s5.getWidth());
        System.out.println("- Area: " + s5.getArea());
        System.out.println("- Perimetro: " +s5.getPerimeter());

    }
}
