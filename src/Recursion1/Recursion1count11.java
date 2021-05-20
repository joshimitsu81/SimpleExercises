import java.util.Scanner;
import java.util.Arrays;  

public class Recursion1counthi {

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
	 System.out.println(counthi2("fbhicgrhixabckj"));
	}
	
	public static int counthi2(String str)	{
      int len = str.length();
      if (len<2) return 0;
      if (len==2) {
          if (str.substring(0,2).equals("hi")) return 1 + counthi2(str.substring(2,len));
      }
      if (str.substring(0,2).equals("hi")&&str.charAt(2)!='x') return 1 + counthi2(str.substring(2,len));
      return counthi2(str.substring(1,len));
	}
}
