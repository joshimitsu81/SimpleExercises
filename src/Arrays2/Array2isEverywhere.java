import java.util.Scanner;

public class Array2isEverywhere      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String1:");
    String input1 = intake.nextLine();
    System.out.println("String2:");
    String input2 = intake.nextLine();
    
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int [] convarray = new int [size];
      for(int i=0; i<size; i++) {
         convarray[i] = Integer.parseInt(inparray[i]);
      }
    int convnum = Integer.parseInt(input2);
    System.out.println(isEverywhere(convarray, convnum));
   }
   
   public static boolean isEverywhere(int[] nums, int val) {
    boolean matched = false;
    for (int i=0; i<nums.length-1; i++) {
      int numa = nums[i];
      int numb = nums[i+1];
      if (numa==val||numb==val) matched = true;
      else return false;
    }
   return (matched);
   }

}
