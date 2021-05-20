import java.util.Scanner;

public class Array2modThree      {

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
      int mod1 = nums[i]%2;
      int mod2 = nums[i+1]%2;
      int mod3 = nums[i+2]%2;
      
      if (mod1==mod2&&mod2==mod3) match = true;
    }     
   return match;
   }

}
