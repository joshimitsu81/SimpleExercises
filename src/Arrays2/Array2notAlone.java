import java.util.Scanner;
import java.util.Arrays;  

public class Array2notAlone      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String1:");
    String input1 = intake.nextLine();
    System.out.println("String2:");
    String input2 = intake.nextLine();
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int[] convarray = new int[size];
      for(int i=0; i<size; i++) {
         convarray[i] = Integer.parseInt(inparray[i]);
      }
//    int convint1 = Integer.parseInt(input1);
    int convint2 = Integer.parseInt(input2);
    System.out.println(testIt(convarray, convint2));
   }
   
   public static int[] testIt(int[] nums, int val) {

    int arrlen = nums.length;
    if (arrlen<3) return nums;
    int[] retarr = new int[arrlen];
    retarr = nums;
    
    for (int i=1; i<arrlen-1; i++) {
      int currint = nums[i];
      int lastint = nums[i-1];
      int nextint = nums[i+1];
      if (currint==val&&(currint!=lastint&&currint!=nextint)) {
       int max = Math.max(lastint, nextint);
       retarr[i] = max;
      }
    }
    
   return retarr;
   }

}
