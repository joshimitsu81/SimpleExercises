import java.util.Scanner;

public class Array2haveThree      {

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
     if (len<3) return false;
     int count3 = 0;
    
    for (int i=0; i<len; i++) {
         boolean this3 = (nums[i]==3);
         if (this3) count3++;
         if (i==len-1) break;
         boolean next3 = (nums[i+1]==3);
         if (this3&&next3) return false;
      }
   return (count3==3);     
   }

}
