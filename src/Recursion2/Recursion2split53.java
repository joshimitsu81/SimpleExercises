import java.util.Scanner;
import java.util.Arrays;  

public class Recursion2split53 {

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
	 System.out.println(split53(new int[]{5, 3, 1, 6}));
	}

   public static boolean split53(int[] nums) {
      return splitTest(0, nums, 0, 0);
   }   
	
   public static boolean splitTest(int place, int[] ringo, int suma, int sumb) {
      //System.out.println("\nplace: " + place);
      //System.out.println("suma: " + suma);
      //System.out.println("sumb: " + sumb);
      if (place >= ringo.length) return suma==sumb;
      //System.out.println("figure " + ringo[place]);
      
      if (ringo[place]%5==0 || ringo[place]%3==0)
      return (splitTest(place+1, ringo, suma+ringo[place], sumb) && ringo[place]%5==0) || (splitTest(place+1, ringo, suma, sumb+ringo[place]) && ringo[place]%3==0);
      return splitTest(place+1, ringo, suma+ringo[place], sumb) || splitTest(place+1, ringo, suma, sumb+ringo[place]);
   }
}
