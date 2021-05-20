import java.util.Scanner;

public class String3countTriple      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(countTriple   (input1));
   }
   
   public static int countTriple  (String str) {
     int wholen = str.length();
     int triplecount = 0;

     for (int a=0;a<wholen-2;a++){
      char thischar1 = str.charAt(a);
      char thischar2 = str.charAt(a+1);
      char thischar3 = str.charAt(a+2);
      if (thischar1==thischar2 && thischar2==thischar3) triplecount++;
      }

     return triplecount;
   }
}
