package sample;

public class Triangle extends Figures {
    public double side_a,side_b,side_c;

    public Triangle(){
        this.side_a=0;
        this.side_b=0;
        this.side_c=0;
    }

    public double area() {
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the parameter of the triangle
        double s = (side_a + side_b + side_c) / 2;
        return Math.sqrt(s * (s - side_a) * (s - side_b) * (s - side_c));
    }

    public double perimeter() {
        // P = a + b + c
        return side_a + side_b + side_c;
    }
}
