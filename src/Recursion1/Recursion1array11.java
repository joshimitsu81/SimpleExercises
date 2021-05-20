import java.util.Scanner;
import java.util.Arrays;  

public class Recursion1array11 {

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
	 System.out.println(array11(new int[]{1, 6, 7, 11, 6, 11, 4}, 0));
	}
	
	public static int array11(int[]nums, int index) {
      int len = nums.length;
      if (len==0) return 0;
      int count = 0;
      int thisone = nums[index];
      if (thisone==11) count++;
      if (index==len-1) return count;
      return count + array11(nums, index+1);
	}
}
