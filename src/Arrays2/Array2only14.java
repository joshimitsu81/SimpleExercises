import java.util.Scanner;

public class Array2only14      {

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
    System.out.println(only14(convarray));
   }
   
   public static boolean only14(int[] nums) {
    boolean no1 = true;
    boolean no4 = true;
    
    for (int i=0; i<nums.length; i++) {
      if (nums[i] == 1) no1 = false;
      if (nums[i] == 4) no4 = false;
    }
   return (no1|no4);
   }

}
