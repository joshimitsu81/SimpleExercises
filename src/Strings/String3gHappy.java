import java.util.Scanner;

public class String3gHappy      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(gHappy   (input1));
   }
   
   public static boolean gHappy  (String str) {
     int wholen = str.length();
     boolean allhappy = false;

     for (int a=1;a<wholen-1;a++){
      char thischar = str.charAt(a);
      if (thischar=='g') {
       if (str.charAt(a-1)=='g'||str.charAt(a+1)=='g') allhappy = true;
       else allhappy = false;
      }
     }

     return allhappy;
   }
}
