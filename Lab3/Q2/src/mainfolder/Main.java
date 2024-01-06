package mainfolder;
import java.util.Arrays;
import java.util.List;
import quadratic.solveQuadratic;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Double> variablesList = Arrays.asList(1.0, 0.0, -4.0);
        solveQuadratic quadraticSolver = new solveQuadratic();
        List<Double> result = quadraticSolver.apply(variablesList);

        System.out.println("Result: " + result);
    }
    }
