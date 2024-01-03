public class Circle extends Shape{
    double radius=0;
    public static final double PI = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        double area = 2*PI*radius;
        System.out.println("The area of circle is : "+ area);
    }
}
