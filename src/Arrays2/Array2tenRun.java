import java.util.Scanner;

public class Array2tenRun      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String1:");
    String input1 = intake.nextLine();
//    System.out.println("String2:");
//    String input2 = intake.nextLine();
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int [] convarray = new int [size];
      for(int i=0; i<size; i++) {
         convarray[i] = Integer.parseInt(inparray[i]);
      }
//    int convint1 = Integer.parseInt(input1);
//    int convint2 = Integer.parseInt(input2);
    System.out.println(testIt(convarray));
   }
   
   public static int[] testIt(int[] nums) {

    int arrlen = nums.length;
    int[] retarr = new int[arrlen];
    boolean this10 = false;
    boolean last10 = false;
    retarr[0]=nums[0];
    
    for (int i=1; i<arrlen; i++) {
      this10 = (nums[i]%10==0);
      last10 = (nums[i-1]%10==0);
      if (!this10&&last10) retarr[i]=nums[i-1];
      else retarr[i]=nums[i];
    }

   return retarr;
   }

}
