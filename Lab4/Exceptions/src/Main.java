//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    ThrowingExceptions obj = new ThrowingExceptions();
    try{
        obj.myMethod();
        obj.divideNum();
        obj.subtructNum();
    }
    catch (myExceptions e){
        System.out.println(e.getMessage());
    }
    finally {
        System.out.println("Good Bye");
    }
    }
}