abstract class Shape {

    public abstract void input();

    public abstract void display();

    public abstract double primeter();

    public abstract double area();
}

class Rectangle extends Shape {

    private double h;
    private double w;

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public void input() {
        
    }
    @Override
    public double primeter() {
        return (h + w) * 2;
    }

    @Override
    public double area() {
        return h * w;
    }

    @Override
    public void display() {
        System.out.println("Primeter = " + primeter());
        System.out.println("Area = " + area());
    }

}

public class Quiz {

    public static void main(String[] args) {
        Shape r1 = new Rectangle(1, 2);
        r1.display();
    }
}