//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        doubleComplex c1 = new doubleComplex(0.0,0.0);
        doubleComplex c2 = new doubleComplex(0.0,0.0);
        doubleComplex c3; // Addition Result
        doubleComplex c4; // Subtraction Result

        c1.setComplex(3.0,4.5); // First Complex Number
        c2.setComplex(2.0,4.0); // Second Complex Number
        c3 = (doubleComplex) c1.Add(c2); // Add
        c4 = (doubleComplex) c1.Sub(c2); // Subtract
        c3.print();
        c4.print();
    }
}
