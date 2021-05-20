import java.util.Scanner;

public class String2oneTwo   {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input = intake.nextLine();
    System.out.println(oneTwo (input));
   }
   
   public static String oneTwo (String str) {
      int len = str.length();
      int last = len % 3 + 2;
      StringBuilder retstr = new StringBuilder("");
      for (int a=0;a<str.length()-last;a+=3) {
         retstr.append(str.charAt(a+1)).append(str.charAt(a+2)).append(str.charAt(a));
      }
      return retstr.substring(0);
   }
}
