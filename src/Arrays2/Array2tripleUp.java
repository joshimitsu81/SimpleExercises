import java.util.Scanner;

public class Array2tripleUp      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String1:");
    String input1 = intake.nextLine();
    System.out.println("String2:");
//    String input2 = intake.nextLine();
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int [] convarray = new int [size];
      for(int i=0; i<size; i++) {
         convarray[i] = Integer.parseInt(inparray[i]);
      }
//    int convint = Integer.parseInt(input2);
    System.out.println(testIt(convarray));
   }
   
   public static boolean testIt(int[] nums) {

    int arrlen = nums.length;
    boolean matchsofar = false;
    
    for (int i=0; i<arrlen-2; i++) {
      if (nums[i]+1==nums[i+1]&&nums[i]+2==nums[i+2]) matchsofar = true;
    }
   return matchsofar;
   }

}
