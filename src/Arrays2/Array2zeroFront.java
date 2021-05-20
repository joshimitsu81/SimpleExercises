import java.util.Scanner;
import java.util.Arrays;  

public class Array2zeroFront		 {

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
	 System.out.println(Arrays.toString(testIt(convarr1)));
	}
	
	public static int[] testIt(int[]	nums)	{
		int arrlen = nums.length;
      int[] retarr = nums;
		for (int	i=0; i<arrlen;	i++) {
         for (int j=arrlen-1; j>0; j--) {
            int currint = retarr[j];
            int lastint = retarr[j-1];
            
            if (currint==0&&lastint!=0) {
               retarr[j] = lastint;
               retarr[j-1] = 0;
            } 
         }
		}
      
      return retarr;
	}

}
