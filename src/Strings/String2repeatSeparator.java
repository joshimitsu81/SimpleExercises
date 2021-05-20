public class String2repeatSeparator {

   public static void main (String args[]) {
    System.out.println(repeatSeparator("sunshine", "rain", 3));
   }
   
   public static String repeatSeparator(String str, String sep, int n) {
      String output = str;
      while (n>1) {
         output = output + sep + str;
         n--;
      }
      return output;
   }
}
