import java.io.*;
class Q2{

public static void main(String[] args){

try{
int number= Integer.parseInt(args[0]);
if(number>0){
System.out.println("Positive");
}
else if(number<0){
System.out.println("Negative");
}
else{
System.out.println("Zero");
}
for(int i=0;i<number;i++){
System.out.println(args[1]);
}
}
catch(NumberFormatException e){
System.out.println("First argument must be a number");
}

}
}
