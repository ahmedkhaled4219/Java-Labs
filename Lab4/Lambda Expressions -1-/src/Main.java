//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

     String first="MynameisAhmedKhaled..";
     String second="I am in open source track";

     String longer=StringUtils.betterString(first,second,((s1, s2) ->s1.length()>s2.length() ));
    String FirstString=StringUtils.betterString(first,second,((s1,s2)->true ));
    String isAlpha=StringUtils.onlyLetters(first);

    System.out.println("This is the longer :"+longer);
    System.out.println("This is the First string :"+FirstString);
    System.out.println(isAlpha);
    }
}