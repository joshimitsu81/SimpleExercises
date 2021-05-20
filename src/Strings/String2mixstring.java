public class String2mixstring {

   public static void main (String args[]) {
    System.out.println(mixString("abc", "wxyz"));
   }
   
   public static String mixString(String a, String b) {
     String outstr = "";
     int lendiff = a.length()-b.length();
     int lenshort = 0;
     int lenlong = 0;
     String longstr = "";
     if (lendiff<0) {
       lenshort = a.length();
       lenlong = b.length();
       longstr = b;
     } else {
       lenshort = b.length();
       lenlong = a.length();
       longstr = a;
     }
     int newpos = 0;
     for (int co1=0;co1<lenshort;co1++) {
       outstr += a.charAt(co1);
       outstr += b.charAt(co1);
       newpos = co1;
     }
     newpos++;
     for (int co2=newpos;co2<lenlong;co2++) {
       outstr += longstr.charAt(co2);
     }
     return outstr;
   }

}
