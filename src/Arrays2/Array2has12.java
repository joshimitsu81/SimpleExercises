import java.util.Scanner;

public class Array2has12      {

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
    boolean found1 = false;
    boolean found2 = false;
    int loc1 = 0;
    int loc2 = 0;
    int len = nums.length;
    
    for (int i=0; i<len; i++) {
      if (nums[i]==2) {
         found2 = true;
         loc2 = i;
         if (found1) {
            if (loc2>loc1) match=true;
         }
      }
      if (nums[i]==1) {
         found1 = true;
         loc1 = i;
      }
    }     
   return match;
   }

}
