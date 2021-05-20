import java.util.Scanner;

public class String3maxBlock      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(maxBlock   (input1));
   }
   
   public static int maxBlock  (String str) {
     int wholelen = str.length();
     int maxcount = 0;
     StringBuilder inarow = new StringBuilder();

     for (int a=0;a<wholelen-1;a++){
      inarow.setLength(0);
      inarow.append(str.charAt(a));
      for (int b=a+1;b<wholelen;b++){
      if (str.charAt(b)==str.charAt(a)) {
        inarow.append(str.charAt(b));
        } else {
         maxcount = Math.max(maxcount, inarow.length());
         inarow.setLength(0);
        }
       }
      }

     return maxcount;
   }
}
