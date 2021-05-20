import java.util.Scanner;

public class Array2more14      {

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
    System.out.println(more14(convarray));
   }
   
   public static boolean more14(int[] nums) {
    int count1 = 0;
    int count4 = 0;
    
    for (int i=0; i<nums.length; i++) {
      if (nums[i] == 1) count1++;
      if (nums[i] == 4) count4++;
    }
   return (count1>count4);
   }

}
