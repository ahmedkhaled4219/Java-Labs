import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Function<Float,Float>convertToFahrenheit=celsius->(celsius * 9 / 5) + 32;
        Function<Float,Float>convertToCELSIUS=Fahrenheit->(Fahrenheit - 32) * 5 / 9;

        float resultInF=convertToFahrenheit.apply(30.0F);
        float resultInC=convertToCELSIUS.apply(80.0F);

        System.out.println("The degree in fahrenheit " + resultInF );
        System.out.println("The degree in celsius " + resultInC );

    }
}