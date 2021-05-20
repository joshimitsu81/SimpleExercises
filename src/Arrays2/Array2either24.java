import java.util.Scanner;

public class Array2either24      {

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
    System.out.println(either24(convarray));
   }
   
   public static boolean either24(int[] nums) {
    boolean found2pair = false;
    boolean found4pair = false;
    boolean match = false;
    
    for (int i=0; i<nums.length-1; i++) {
      int numa = nums[i];
      int numb = nums[i+1];
      if (numa==2&&numb==2) found2pair = true;
      if (numa==4&&numb==4) found4pair = true;
    }
    match = found2pair^found4pair;
   return match;
   }

}
