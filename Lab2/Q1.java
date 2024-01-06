import java.io.*;
import java.util.Random;
class Q1 {
public static void main (String[] args) {

long start=System.nanoTime ();


int arr[]=new int[1000];
Random random=new Random();
int min=arr[0];
int max=arr[0];
for(int i=0; i<1000;i++){
arr[i]=random.nextInt();
if(min>arr[i]){
min=arr[i];
}
if(max<arr[i]){
max=arr[i];
}
}

long end=System.nanoTime ();


System.out.println("Max = " + max );
System.out.println("Min = " + min );
System.out.println(end-start);

/*for(int i=0; i<1000;i++){
System.out.println(arr[i]);
}*/



}
}
