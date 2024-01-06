import java.io.*;
import java.util.Random;
import java.util.Arrays;

class Q1s {

void binarySearch(int arr[],int L,int H,int key){
    if (L<=H){
        int mid = L+(H-L)/2;
        if(key == arr[mid]){
           // System.out.println("Key is found");
            return;
        }
        if(key > arr[mid]){
            binarySearch(arr,mid+1,H,key);
        }
        else{
            binarySearch(arr,L,mid-1,key);
        }
    }
}


public static void main (String[] args) {




int arr[]=new int[1000];
Random random=new Random();
for(int i=0; i<1000;i++){
//arr[i]=random.nextInt(100);
arr[i]=i;
}
Arrays.sort(arr);

long start=System.nanoTime ();
Q1s obj=new Q1s();

obj.binarySearch(arr,0,999,arr[0]);
obj.binarySearch(arr,0,999,2000);
long end=System.nanoTime ();
System.out.println(end-start);
}
}

