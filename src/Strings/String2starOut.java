import java.util.Scanner;

public class String2starOut   {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input = intake.nextLine();
    System.out.println(starOut (input));
   }
   
   public static String starOut (String str) {
      int len = str.length();
      StringBuilder retstr = new StringBuilder("");
      for (int a=1;a<str.length()-1;a++) {
         char c1 = str.charAt(a-1);
         char c2 = str.charAt(a);
         char c3 = str.charAt(a+1);
         if (a==1) {
            if (c1=='*'||c2=='*') {}
            else {retstr.append(c1);
               if (c3!='*')
               retstr.append(c2);   
            }
         }
         else if (a==len-2) {
            if (c2=='*'||c3=='*') {}
            else if (c1!='*') retstr.append(c2);
            retstr.append(c3);
         }
         else if (c1=='*'||c2=='*'||c3=='*') {}
         else retstr.append(c2);
      }
      return retstr.substring(0);
   }
}
