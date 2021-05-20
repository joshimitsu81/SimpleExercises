import java.util.Scanner;

public class Array2countEvens      {

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
    System.out.println(countEvens   (convarray));
   }
   
   public static int countEvens  (int[] nums) {
    int retotal = 0;
    for (int i=0; i<nums.length; i++) {
     if (nums[i]%2==0) retotal++;
    }
    
    return retotal;
   }
}
