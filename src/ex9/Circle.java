package ex9;

public class Circle extends Ellipse{
    Circle(double r) {
        super(r, r);
    }

    public double getRadius(){
        return getMajorAxis();
    }
}
