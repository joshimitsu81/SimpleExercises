import java.util.Scanner;
import java.util.Arrays;  

public class Array2fizzBuzz		 {

	public static void main	(String args[]) {
	 Scanner	intake =	new Scanner(System.in);
	 System.out.println("String1:");
	 String input1	= intake.nextLine();
	 System.out.println("String2:");
    String input2 = intake.nextLine();
//	 String inparr1[]	= input1.split(", ");
//	 int size =	inparr1.length;
//	 int[] convarr1 =	new int[size];
//		for(int i=0; i<size;	i++) {
//			convarr1[i]	= Integer.parseInt(inparr1[i]);
//		}
    int convint1 =	Integer.parseInt(input1);
	 int convint2 =	Integer.parseInt(input2);
	 System.out.println(Arrays.toString(testIt(convint1, convint2)));
	}
	
	public static String[] testIt(int start, int end)	{
      int currint = start;
      int arrlen = end-start;
      String retarr[] = new String[arrlen];
      for (int i=start, j=0; i<end; i++, j++) {
         boolean multi3 = (i%3==0);
         boolean multi5 = (i%5==0);
         if (multi3&&multi5) retarr[j]="FizzBuzz";
         else if (multi3) retarr[j]="Fizz";
         else if (multi5) retarr[j]="Buzz";
         else retarr[j]=String.valueOf(i);
      }
            
      return retarr;
	}

}
