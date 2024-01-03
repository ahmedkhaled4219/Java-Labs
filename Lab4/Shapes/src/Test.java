import java.util.List;

public class Test {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
