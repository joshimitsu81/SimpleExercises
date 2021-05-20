import java.util.Scanner;

public class Array2post      {

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
    System.out.println(testIt(convarray));
   }
   
   public static int[] testIt(int[] nums) {

    int arrlen = nums.length;
    boolean found4 = false;
    int loc4 = 0;
    
    for (int i=0; i<arrlen; i++) {
      if (nums[i] == 4) {
         found4 = true; 
         loc4 = i;
         break;
         }
    }
    
    if (!found4) return nums;
    
    int[] retarr = new int[loc4];
     for (int j=0; j<loc4; j++) {
      retarr[j] = nums[j];
    }

   return retarr;
   }

}
