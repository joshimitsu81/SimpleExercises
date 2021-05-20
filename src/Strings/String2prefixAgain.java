public class String2prefixAgain {

   public static void main (String args[]) {
    System.out.println(prefixAgain("abXYabc", 2));
   }
   
   public static boolean prefixAgain(String str, int n) {
      String pre = str.substring(0,n);
      boolean again = false;
      for (int place=1;place<str.length()-n;place++) {
         String sub=str.substring(place,place+n);
         if (sub.equals(pre)) again = true;
      }
      return again;
   }
}
