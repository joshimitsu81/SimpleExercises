import java.util.Scanner;
import java.util.Arrays;  

public class Array3fix34 {

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
	
	public static int[] testIt(int[] nums)	{
		int arrlen = nums.length;
      int[] retarr = nums;
		for (int	i=0; i<arrlen;	i++) {
         if (retarr[i]==3) {
            int place3 = i;
            for (int j=0; j<arrlen; j++) {
               if (retarr[j]==4&&retarr[j-1]!=3) {
                  retarr[j]=retarr[place3+1];
                  retarr[place3+1]=4;
               }
            }
         }
		}
      
      return retarr;
	}

}
