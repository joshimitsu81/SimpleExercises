import java.util.Scanner;
import java.util.Arrays;  

public class Recursion2groupSumClump {

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
	 System.out.println(groupSumClump(0, new int[]{3, 1, 5, 5, 5}, 9));
	}
	
   public static boolean groupSumClump(int start, int[] nums, int target) {

     if (start >= nums.length) return (target==0);

    int count=1;
    int tracker=start;
     while (tracker<nums.length-1&&nums[tracker]==nums[tracker+1]) {
      count++;
      tracker++;
     }

    int subtot = nums[start]*count;
       
     if (count>1)  
     return groupSumClump(start+count, nums, target-subtot)||groupSumClump(start+count, nums, target);

     
     if (groupSumClump(start+1, nums, target)) return true;
     
     if (groupSumClump(start+1, nums, target-nums[start])) return true;
     
     return false;
   }
}
