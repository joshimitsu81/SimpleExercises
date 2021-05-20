import java.util.Scanner;

public class String3notReplace      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    System.out.println(notReplace   (input1));
   }
   
   public static String notReplace  (String str) {
     int wholelen = str.length();
     StringBuilder inarow = new StringBuilder();
      int forstart = 1;
      //String teststart = str.substring(0,1);
      //char testspace = str.charAt(2);
      if (str.substring(0,2).equals("is")&&!Character.isLetter(str.charAt(2))) {
       inarow.append("is not");
       forstart = 2;
      } else inarow.append(str.charAt(0));

     for (int a=forstart;a<wholelen-2;a++){
       if (str.substring(a,a+2).equals("is") && !Character.isLetter(str.charAt(a-1)) && !Character.isLetter(str.charAt(a+2))) {
        inarow.append("is not ");
        a+=2;
       } else {
        inarow.append(str.charAt(a));
        if (a==wholelen-2) inarow.append(str.charAt(a+1));
       }
      }
       String testend = str.substring(wholelen-2,wholelen);
       char testspace = str.charAt(wholelen-3);
       if (str.substring(wholelen-2,wholelen).equals("is")&&!Character.isLetter(str.charAt(wholelen-3))) {
       inarow.append("is not");
         } else inarow.append(str.substring(wholelen-2,wholelen));
     return inarow.toString();
   }
}
