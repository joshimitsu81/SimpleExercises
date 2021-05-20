import java.util.Scanner;

public class Array2sum67      {

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
    System.out.println(sum67(convarray));
   }
   
   public static int sum67(int[] nums) {
    int subtotal = 0;
    boolean found6 = false;
    
    for (int i=0; i<nums.length; i++) {
      boolean addit = false;
      boolean found7 = false;
      if (nums[i]==6) found6 = true;
      if (nums[i]==7) found7 = true;
      if (!found6) addit = true;
      if (found6 && found7) {addit = false; found6 = false;}
      if (addit) subtotal+=nums[i];
    }
   return subtotal;
   }

}
