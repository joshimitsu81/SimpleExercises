import java.util.Scanner;

public class String2zipZap   {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input = intake.nextLine();
    System.out.println(zipZap (input));
   }
   
   public static String zipZap (String str) {
      int len = str.length();
      StringBuilder retstr = new StringBuilder("");
      for (int a=0;a<str.length()-2;a++) {
         if (str.charAt(a)=='z' && str.charAt(a+2)=='p') {
         retstr.append('z').append('p');
         a+=2;
         }
         else if (a==str.length()-3) retstr.append(str.charAt(a)).append(str.charAt(a+1)).append(str.charAt(a+2));
         else retstr.append(str.charAt(a));
      }
      return retstr.substring(0);
   }
}
