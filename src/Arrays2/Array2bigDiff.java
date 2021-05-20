import java.util.Scanner;

public class Array2bigDiff      {

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
    System.out.println(bigDiff   (convarray));
   }
   
   public static int bigDiff  (int[] nums) {
    int avg = 0;
    int subtotal = 0;
    int min = nums[0];
    int max = nums[0];
    int minloc = 0;
    int maxloc = 0;
    
    for (int i=0; i<nums.length; i++) {
     min = Math.min(min,nums[i]);
     max = Math.max(max,nums[i]);
     if (nums[i]==min) minloc=i;
     if (nums[i]==max) maxloc=i;
    }
    
    for (int i=0; i<nums.length; i++) {
     if (!(i==minloc) && !(i==maxloc)) {
      subtotal+=nums[i];
     }
    }
    
    if (min==max) avg = subtotal/(nums.length-1);
    else avg = subtotal/(nums.length-2);
    return avg;
   }
}
