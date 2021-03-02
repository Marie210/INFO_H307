package sample;

public class Figures {
    public double pi = Math.PI;;

    public double perimeter(){
        return 0;
    }

    public double area(){
        return 0;
    }

    public static void main(String[] args) {
        Rectangle f=new Rectangle();
        // Rectangle test
        f.width=5;
        f.length=7;
        System.out.println("Rectangle width: " + f.width + " and length: " + f.length
                + "\nResulting area: " + f.area()
                + "\nResulting perimeter: " + f.perimeter() + "\n");

        // Circle test
        Circle f2=new Circle();
        f2.radius=5;
        System.out.println("Circle radius: " + f2.radius
                + "\nResulting Area: " + f2.area()
                + "\nResulting Perimeter: " + f2.perimeter() + "\n");

        // Triangle test
        Triangle f3=new Triangle();
        f3.side_a=5;
        f3.side_b=3;
        f3.side_c=4;
        System.out.println("Triangle sides lengths: " + f3.side_a + ", " + f3.side_b + ", " + f3.side_c
                + "\nResulting Area: " + f3.area()
                + "\nResulting Perimeter: " + f3.perimeter() + "\n");
    }

}

