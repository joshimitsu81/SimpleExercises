import java.util.Scanner;

public class Array2has77      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int [] convarray = new int [size];
      for(int i=0; i<size; i++) {
         convarray[i] = Integer.parseInt(inparray[i]);
      }
    System.out.println(testIt(convarray));
   }
   
   public static boolean testIt(int[] nums) {
    boolean match = false;
    int len = nums.length;
    
    for (int i=0; i<len-2; i++) {
      int numa = nums[i];
      int numb = nums[i+1];
      int numc = nums[i+2];
      if (numa==7) {
        if (numb==7||numc==7) match = true;
      }
    }
    
    if (nums[len-2]==7&&nums[len-1]==7) match = true;
     
   return match;
   }

}
