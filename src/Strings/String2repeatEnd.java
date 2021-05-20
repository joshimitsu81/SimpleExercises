public class String2repeatEnd {

   public static void main (String args[]) {
    System.out.println(repeatEnd("sunshine", 3));
   }
   
   public static String repeatEnd(String str, int n) {
     String endPart = "";
     String retStr = "";
     int len = str.length();
     int strPos = len-n;
     while (strPos < len) {
      endPart += str.charAt(strPos);
      strPos++;
     }
     for (int rep=0;rep<n;rep++) {
      retStr += endPart;
     }
     return retStr;
   }
}
