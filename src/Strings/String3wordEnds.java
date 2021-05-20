import java.util.Scanner;

public class String3wordEnds    {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(countYZ (input1));
   }
   
   public static int countYZ(String str) {
     int wholen = str.length();
     boolean onword = false;
     boolean endword = false;
     boolean alpha = false;
     int wordcount = 0;
     StringBuilder locstr = new StringBuilder("");
     for (int a=0;a<wholen;a++){
      char thischar = str.charAt(a);
      alpha = Character.isLetter(thischar);
      if (alpha) {
         locstr.append(thischar);
         onword = true;
      } 
      if (!alpha) {
         endword = true;
         if (locstr.substring(0).endsWith("y")||locstr.substring(0).endsWith("z")) {
            if (onword&&endword) wordcount++;
            onword = false;
            endword = false;
       }
      }
     }
      if (str.endsWith("y")||str.endsWith("z")) {
         wordcount++;
      }
     return wordcount;
   }
}
