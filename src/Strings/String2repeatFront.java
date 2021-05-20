public class String2repeatFront {

   public static void main (String args[]) {
    System.out.println(repeatFront("sunshine", 3));
   }
   
   public static String repeatFront(String str, int n) {
     String frontPart = "";
     String retStr = "";
     int len = str.length();
     int strPos = 0;
     while (strPos < n) {
      frontPart += str.charAt(strPos);
      strPos++;
     }
     for (int rep=0;rep<n;rep++) {
      frontPart = frontPart.substring(0,n-rep);
      retStr += frontPart;
     }
     return retStr;
   }
}
