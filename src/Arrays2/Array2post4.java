import java.util.Scanner;
import java.util.Arrays;  

public class Array2post4      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String1:");
    String input1 = intake.nextLine();
//    System.out.println("String2:");
//    String input2 = intake.nextLine();
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int[] convarray = new int[size];
      for(int i=0; i<size; i++) {
         convarray[i] = Integer.parseInt(inparray[i]);
      }
//    int convint1 = Integer.parseInt(input1);
//    int convint2 = Integer.parseInt(input2);
    System.out.println(Arrays.toString(testIt(convarray)));
   }
   
   public static int[] testIt(int[] nums) {

    int arrlen = nums.length;
    boolean found4 = false;
    int loc4 = 0;
    
    for (int i=arrlen-1; i>=0; i--) {
      if (nums[i] == 4) {
         found4 = true; 
         loc4 = i;
         break;
         }
    }
    
    if (!found4) return nums;
    
    int[] retarr = new int[arrlen-loc4-1];
     for (int j=loc4+1, k=0; j<arrlen; j++, k++) {
     System.out.println("j="+j);
      retarr[k] = nums[j];
    }

   return retarr;
   }

}
