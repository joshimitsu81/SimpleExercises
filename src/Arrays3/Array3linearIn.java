import java.util.Scanner;
import java.util.Arrays;  

public class Array3linearIn {

	public static void main	(String args[]) {
	 Scanner	intake =	new Scanner(System.in);
	 System.out.println("String1:");
	 String input1	= intake.nextLine();
    System.out.println("String2:");
	 String input2 = intake.nextLine();
	 String inparr1[]	= input1.split(", ");
	 int size1 =	inparr1.length;
	 int[] convarr1 =	new int[size1];
	 for(int i=0; i<size1;	i++) {
			convarr1[i]	= Integer.parseInt(inparr1[i]);
	 }
	 String inparr2[]	= input2.split(", ");
	 int size2 =	inparr2.length;
	 int[] convarr2 =	new int[size2];
	 for(int i=0; i<size2;	i++) {
			convarr2[i]	= Integer.parseInt(inparr2[i]);
	 }
//		int convint1 =	Integer.parseInt(input1);
//		int convint2 =	Integer.parseInt(input2);
	 System.out.println(testIt(convarr1, convarr2));
	}
	
	public static boolean testIt(int[] outer, int[] inner)	{
   
		int outlen = outer.length;
      int inlen = inner.length;
      boolean retval = false;
      int foundcount=0;
		for (int	i=0; i<inlen;	i++) {
         boolean foundinner = false;
         for (int j=0; j<outlen; j++) {
            if (outer[j]==inner[i]) foundinner = true;
         }
         if (foundinner) foundcount++;
       }
       retval = (foundcount==inlen);
      
      return retval;
      
	}
}
