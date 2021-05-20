import java.util.Scanner;

public class Array2shiftLeft      {

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
    int holding = nums[0];
    
    for (int i=0; i<arrlen-1; i++) {
      retarr[i] = nums[i+1];
    }
    retarr[arrlen-1] = holding;
   return retarr;
   }

}
