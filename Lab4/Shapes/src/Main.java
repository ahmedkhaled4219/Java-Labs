import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.get(0).setLength(10);
        rectangles.get(0).setWidth(10);
        rectangles.get(1).setLength(20);
        rectangles.get(1).setWidth(20);
        Test.drawShapes(rectangles);

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());
        circles.get(0).setRadius(30);
        circles.get(1).setRadius(20);
        Test.drawShapes(circles);
    }
}