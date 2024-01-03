public class Rectangle extends Shape {
    double length=0;
    double width=0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        double area = length * width;
        System.out.println("The area of rectangle = "+ area);
    }
}
