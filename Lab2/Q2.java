import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Q2 {

void firstWay(String sentence,String word){
String[]words=sentence.split(" ");
int count =0;

for(int i=0;i<words.length;i++){
if(words[i].equals(word)){
count++;
}
}
System.out.println(count);
}
//------------------------------------------------
void secondWay(String sentence,String word){
int index=sentence.indexOf(word);
int count=0;
while(index!=-1){
count++;
index=sentence.indexOf(word,index+1);
}
System.out.println(count);
}
//---------------------------------------------------
void usingStringTokenizer(String sentence,String word){
StringTokenizer tokenizer = new StringTokenizer(sentence," ");
int count=0;

while(tokenizer.hasMoreTokens()){
String target = tokenizer.nextToken();
if(target.equals(word)){
count++;
}
}
System.out.println(count);
}
//---------------------------------------------------
void withRegex(String sentence,String word){
String regex = "\\b" + word + "\\b";
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(sentence);
int count = 0;
while (matcher.find()) {
count++;
}
System.out.println(count);
}
//------------------------------------------------------
public static void main (String[] args) {

Q2 obj=new Q2();
//obj.firstWay("I love el ahly ahly ahly ahly","ahly");
//obj.secondWay("I love el ahly ahly ahly ahly","ahly");
//obj.usingStringTokenizer("I love el ahly ahly, ahly ahly","ahly");
obj.withRegex("I love el -ahly- ahly +ahly .ahly","ahly");
}
}
