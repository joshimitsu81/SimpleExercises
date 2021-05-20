import java.util.Scanner;

public class String3notReplace      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(notReplace   (input1));
   }
   
   public static String notReplace  (String str) {
     int wholelen = str.length();
     StringBuilder inarow = new StringBuilder();

     for (int a=1;a<wholelen-1;a++){
       if (str.subString(a,a+2).equals("is") && !Character.isLetter(str.charAt(a-1)) && Character.isLetter(str.charAt(a-1))) {
        inarow.append("is not ");
        a+=3;
       }
      }

     return inarow.toString();
   }
}
