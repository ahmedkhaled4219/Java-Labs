import java.io.*;

class bonus {
public static void main (String[] args) {

String word = args[0];
int length=word.length();

Boolean palindrome=false;
for(int i=0;i<length/2;i++){
if(word.charAt(i)==word.charAt(length-1-i)){
palindrome=true;
}
else{
palindrome=false;
break;
}
}
if(palindrome){
System.out.println("Yess");
}
else{
System.out.println("NOO");
}
}
}
