import java.util.Scanner;

public class Array2sameEnds      {

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
    int convint = Integer.parseInt(input2);
    System.out.println(testIt(convarray, convint));
   }
   
   public static boolean testIt(int[] nums, int len) {
    if (len==0) return true;
    int arrlen = nums.length;
    boolean matchsofar = false;
    int endpos = arrlen - len;
    
    for (int i=0, j=endpos; i<len; i++, j++) {
      if (nums[i]==nums[j]) matchsofar = true; else return false;
    }
   return matchsofar;
   }

}
