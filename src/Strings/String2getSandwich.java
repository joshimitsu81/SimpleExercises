import java.util.Scanner;

public class String2getSandwich  {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input = intake.nextLine();
    System.out.println(getSandwich(input));
   }
   
   public static String getSandwich (String str) {
     int start = str.indexOf("bread");
     int end = str.lastIndexOf("bread");
     if (start != -1 && end != -1 && start != end) return str.substring(start+5, end);
     else return "";
   }
}
