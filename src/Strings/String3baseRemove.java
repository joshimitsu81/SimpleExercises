import java.util.Scanner;

public class String3baseRemove   {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("Base:");
    String input1 = intake.nextLine();
    System.out.println("Remove:");
    String input2 = intake.nextLine();
    System.out.println(withoutString (input1, input2));
   }
   
   public static String withoutString (String base, String remove) {
     StringBuilder finstr = new StringBuilder("");
     int baselen = base.length();
     int remlen = remove.length();
     for (int a=0;a<=baselen-remlen;a++){
      String locstr = base.substring(a,a+remlen);
      if (locstr.equals(remove)) a+=remlen-1;
      else {
         finstr.append(base.charAt(a));
         if (a==baselen-remlen) finstr.append(base.substring(baselen-remlen+1,baselen));
         }
    }
    return finstr.substring(0);
   }
}
