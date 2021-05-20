import java.util.Scanner;

public class String2sameStarChar   {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input = intake.nextLine();
    System.out.println(sameStarChar (input));
   }
   
   public static boolean sameStarChar (String str) {
      boolean click = false;
      boolean twoSide = true;
      boolean noStar = true;
      char star = '*';
      int len = str.length();
      if (str.charAt(0)==star||str.charAt(len-1)==star) {
         click = true;
         noStar = false;
      }
      for (int place=1;place<str.length()-1;place++) {
         boolean foundStar = (str.charAt(place)==star);
         boolean sameChar = (str.charAt(place-1)==str.charAt(place+1));
         if (foundStar&&sameChar) {
            click = true;
            noStar = false;
         }
         if (foundStar&&!sameChar) {
            twoSide = false;
            noStar = false;
         }
      }
      return (click&&twoSide)||noStar;
   }
}
