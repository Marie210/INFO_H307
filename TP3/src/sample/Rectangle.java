package sample;

public class Rectangle extends Figures {
    public double width,length;
    public Rectangle(){
        this.width=0;
        this.length=0;
    }

    public double area() {
        // A = w * l
        return width * length;
    }

    public double perimeter() {
        // P = 2(w + l)
        return 2 * (width + length);
    }
}
