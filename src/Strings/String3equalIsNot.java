import java.util.Scanner;

public class String3equalIsNot     {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(equalIsNot  (input1));
   }
   
   public static boolean equalIsNot (String str) {
     int wholen = str.length();
     int isCount = 0;
     int notCount = 0;

     for (int a=0;a<wholen-1;a++){
      String locstr = str.substring(a,a+2);
      if (locstr.equals("is")) isCount++;
     }
     
     for (int b=0;b<wholen-2;b++){
      String locstr = str.substring(b,b+3);
      if (locstr.equals("not")) notCount++;
     }

     return (isCount==notCount);
   }
}
