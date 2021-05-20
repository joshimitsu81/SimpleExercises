import java.util.Scanner;
import java.util.Arrays;  

public class Recursion2groupNoAdj {

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
	 System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4, 2}, 7));
	}
	
	public static boolean groupNoAdj(int start, int[] nums, int target)	{
      System.out.println("Trying start>=length");
      if (start >= nums.length) {
        System.out.println("Found start>=length");
        System.out.println("Start: " + start);
        System.out.println("Target: " + target);
        return (target == 0);
        }
      System.out.println("Trying Case one");
      if (groupNoAdj(start+1, nums, target)) {
        System.out.println("Found Case one");
        System.out.println("Start: " + start);
        System.out.println("Target: " + target);
         return true;
         }
      System.out.println("Trying Case two");
      if (groupNoAdj(start+2, nums, target-nums[start])) {
        System.out.println("Found Case two");
        System.out.println("Start: " + start);
        System.out.println("Target: " + target);
         return true;
         }
      System.out.println("Nope");
      return false;
	}
}
