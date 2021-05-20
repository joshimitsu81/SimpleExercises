import java.util.Scanner;
import java.util.Arrays;  

public class Recursion2groupSum6 {

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
	 System.out.println(groupSum6(0, new int[]{5, 6, 2}, 7));
	}
	
	public static boolean groupSum6(int start, int[] nums, int target)	{
     // Base case: if there are no numbers left, then there is a
     // solution only if target is 0.
     if (start >= nums.length) return (target == 0);
     
     // Key idea: nums[start] is chosen or it is not.
     // Deal with nums[start], letting recursion
     // deal with all the rest of the array.
     
     // Recursive call trying the case that nums[start] is chosen --
     // subtract it from target in the call.
     int next = start+1;
     int reduced = target-nums[start];
     if (groupSum6(next, nums, reduced)) return true;
     
     // Recursive call trying the case that nums[start] is not chosen.
     if (groupSum6(next, nums, target)) return (nums[start]!=6);
     
     // If neither of the above worked, it's not possible.
     return false;
	}
}
