package sample;

public class Circle extends Figures {
    public double radius;

    public Circle(){
        this.radius = 0;
    }
    public double area() {
        // A = π r^2
        return pi * Math.pow(radius, 2);
    }
    public double perimeter() {
        // P = 2πr
        return 2 * pi * radius;
    }
}
