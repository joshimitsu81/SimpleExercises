import java.util.Scanner;

public class String2xyzMiddle  {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input = intake.nextLine();
    System.out.println(xyzMiddle(input));
   }
   
   public static boolean xyzMiddle (String str) {
      int len = str.length();
      boolean odd = (len % 2 == 1);
      int half = len/2;
      boolean found = false;
      boolean middle = false;
      for (int place=0;place<len-3;place++){
         String sub = str.substring(place,place+3);
         
         if (odd) {
            if (sub.equals("xyz") && place==half-1) {
            found = true;
            middle = true;
            return true;
            }
         } else {
            if (sub.equals("xyz") && (place==half-1||place==half-2)) {
            found = true;
            middle = true;
            return true;
         }
         }
      }
      return false;
   }
}
