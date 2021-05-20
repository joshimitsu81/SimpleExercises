import java.util.Scanner;

public class String3sumDigits      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(sumDigits   (input1));
   }
   
   public static int sumDigits  (String str) {
     int wholen = str.length();
     int digitsum = 0;
     StringBuilder inarow = new StringBuilder();

     for (int a=0;a<wholen;a++){
      char thischar1 = str.charAt(a);
      if (Character.isDigit(thischar1)) {
       for (int b=a;b<wholen;b++) {
         if (Character.isDigit(str.charAt(b))) {
          inarow.append(str.charAt(b));
          a++;
          } else break;
         }
          if (inarow.length()>0){
          digitsum += Integer.parseInt(inarow.toString());
          inarow.setLength(0);
          }

       }
                 //if (inarow.length()>0 && a==wholen-1) digitsum += Integer.parseInt(inarow.toString());
      }

     return digitsum;
   }
}
