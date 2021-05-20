import java.util.Scanner;
import java.util.Arrays;  

public class Recursion1strDist {

	public static void main	(String args[]) {
//	 Scanner	intake =	new Scanner(System.in);
//	 System.out.println("String1:");
//	 String input1	= intake.nextLine();
//    System.out.println("String2:");
//	 String input2 = intake.nextLine();
//	 String inparr1[]	= input1.split(", ");
//	 int size1 =	inparr1.length;
//	 int[] convarr1 =	new int[size1];
//	 for(int i=0; i<size1;	i++) {
//			convarr1[i]	= Integer.parseInt(inparr1[i]);
//	 }
//	 String inparr2[]	= input2.split(", ");
//	 int size2 =	inparr2.length;
//	 int[] convarr2 =	new int[size2];
//	 for(int i=0; i<size2;	i++) {
//			convarr2[i]	= Integer.parseInt(inparr2[i]);
//	 }
//		int convint1 =	Integer.parseInt(input1);
//		int convint2 =	Integer.parseInt(input2);
	 System.out.println(strDist("cccatcowcatxx", "cat"));
	}
	
	public static int strDist(String str, String sub)	{
      int rlen = str.length();
      int blen = sub.length();
      if (blen>rlen) return 0;
      int tracker = 0;
      if (!str.startsWith(sub)) return tracker + strDist(str.substring(1), sub);
      if (!str.endsWith(sub)) return tracker + strDist(str.substring(0,rlen-1), sub);
      if (str.startsWith(sub)&str.endsWith(sub)) return tracker + rlen;
      return tracker;
	}
}
