import java.util.Scanner;

public class Array2lucky13      {

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
    System.out.println(lucky13(convarray));
   }
   
   public static boolean lucky13(int[] nums) {
    boolean no1 = true;
    boolean no3 = true;
    
    for (int i=0; i<nums.length; i++) {
      if (nums[i] == 1) no1 = false;
      if (nums[i] == 3) no3 = false;
    }
   return (no1&&no3);
   }

}
