package quadratic;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class solveQuadratic implements Function<List<Double>,List<Double>> {
    @Override
    public List<Double> apply(List<Double> doubles) {
        Double discriminant = (doubles.get(1) * doubles.get(1))-(4* doubles.get(0)* doubles.get(2));
        Double root1=0.0;
        Double root2=0.0;
        if(discriminant<0){
            System.out.println("The root is imaginary");
        }
        else{
             root1=((-doubles.get(1)+Math.sqrt(discriminant))/(2* doubles.get(0)));
             root2=((-doubles.get(1)-Math.sqrt(discriminant))/(2* doubles.get(0)));
        }
        return Arrays.asList(root1, root2);
    }
}




