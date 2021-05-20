import java.util.Scanner;

public class String3sameEnds      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(sameEnds   (input1));
   }
   
   public static String sameEnds  (String string) {
     int wholelen = string.length();
     int halflen = wholelen/2;
     String match = "";

     for (int a=0;a<halflen;a++){
      String substart = string.substring(0,a+1);
      String subend = string.substring(wholelen-a-1,wholelen);
      if (substart.equals(subend)) match = substart;
      }

     return match;
   }
}
