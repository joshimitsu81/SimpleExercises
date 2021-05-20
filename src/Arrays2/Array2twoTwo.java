import java.util.Scanner;

public class Array2twoTwo      {

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
    boolean match = true;
     int len = nums.length;
     if (len<2) return true;
     if (len==2) {return !(nums[0]==2^nums[1]==2);}
    for (int i=1; i<len-1; i++) {
         boolean this2 = (nums[i]==2);
         boolean next2 = (nums[i+1]==2);
         boolean last2 = (nums[i-1]==2);
         if (this2&&!next2&&!last2) return false;
         if (i==len-2) {if (!this2&&next2) return false;}
      }
   return match;     
   }

}
