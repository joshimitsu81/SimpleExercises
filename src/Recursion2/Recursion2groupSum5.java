import java.util.Scanner;
import java.util.Arrays;  

public class Recursion2groupSum5 {

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
	 System.out.println(groupSum5(0, new int[]{3, 5, 1, 1}, 9));
	}
	
	public static boolean groupSum5(int start, int[] nums, int target)	{
   	if (start >= nums.length){
   		return target == 0;
   	}
   	if (nums[start] % 5 == 0){
   		if (start + 1 < nums.length && nums[start + 1] == 1){
   			return groupSum5(start + 2, nums, target - nums[start]);
   		}
   		return groupSum5(start + 1, nums, target - nums[start]);
   	}
   	return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
      }
}
