import java.util.Scanner;
import java.util.Arrays;  

public class Array3canBalance {

	public static void main	(String args[]) {
	 Scanner	intake =	new Scanner(System.in);
	 System.out.println("String1:");
	 String input1	= intake.nextLine();
//		System.out.println("String2:");
//		String input2 = intake.nextLine();
	 String inparr1[]	= input1.split(", ");
	 int size =	inparr1.length;
	 int[] convarr1 =	new int[size];
	 for(int i=0; i<size;	i++) {
			convarr1[i]	= Integer.parseInt(inparr1[i]);
	 }
//		int convint1 =	Integer.parseInt(input1);
//		int convint2 =	Integer.parseInt(input2);
	 System.out.println(testIt(convarr1));
	}
	
	public static boolean testIt(int[] nums)	{
		int arrlen = nums.length;
      boolean retval = false;
      int leftsum = 0;
      int rightsum = 0;
		for (int	i=0; i<arrlen;	i++) {
            rightsum = 0;
            leftsum+=nums[i];
            for (int j=i+1; j<arrlen; j++) {
               rightsum+=nums[j];
            }
            if (leftsum==rightsum) retval = true;
         }
      
      return retval;
	}

}
