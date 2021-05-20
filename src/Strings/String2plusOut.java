import java.util.Scanner;

public class String2plusOut   {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println("Word:");
    String input2 = intake.nextLine();
    System.out.println(plusOut (input1, input2));
   }
   
   public static String plusOut (String str, String word) {
      int slen = str.length();
      int wlen = word.length();
      int lastCheck = 0;
      StringBuilder retstr = new StringBuilder("");
      for (int a=0;a<=slen-wlen;a++) {
         String sub = str.substring(a,a+wlen);
         if (sub.equals(word)) {
            retstr.append(sub);
            a=a+wlen-1;
            lastCheck=a;
         } else retstr.append('+');
      }
      if (lastCheck<=str.length()-wlen) {         
         for (int b=0;b<wlen-1;b++) {
            retstr.append('+');
         }
      }
      return retstr.substring(0);
   }
}
