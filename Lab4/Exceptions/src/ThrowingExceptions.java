import java.sql.SQLOutput;
import java.util.Scanner;

public class ThrowingExceptions {
    public void myMethod() throws myExceptions{
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your integers : ");
        if(input.hasNextInt()) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.println(n1);
            System.out.println(n2);

        }
            else{
                throw new myExceptions("You should enter intgers only");
            }
    }
    public void divideNum() throws myExceptions{
        System.out.print("Enter your numbers to divide them : ");
        Scanner input=new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if(n2 == 0){
            throw new myExceptions("You can't divide by zero");
        }
        else{
            int result= n1 / n2;
            System.out.println(result);
        }


    }
    public void subtructNum() throws myExceptions{
        System.out.print("Enter your numbers to subtruct them : ");
        Scanner input=new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int result= n1 - n2;
        if(n2>n1){
            throw new myExceptions("second number can't be greater than first number");
        }
        else{
            System.out.println(result);
        }
        
    }
}
