import java.util.Scanner;

public class Array2matchUp      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String1:");
    String input1 = intake.nextLine();
    System.out.println("String2:");
    String input2 = intake.nextLine();
    
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int [] convarray1 = new int [size];
      for(int i=0; i<size; i++) {
         convarray1[i] = Integer.parseInt(inparray[i]);
      }
    inparray = input2.split(", ");  
    int [] convarray2 = new int [size];
      for(int i=0; i<size; i++) {
         convarray2[i] = Integer.parseInt(inparray[i]);
      }

    System.out.println(testIt(convarray1, convarray2));
   }
   
   public static int testIt(int[] nums1, int[] nums2) {
    int count = 0;
    for (int i=0; i<nums1.length; i++) {
      int numa = nums1[i];
      int numb = nums2[i];
      int diff = Math.abs(numa-numb);
      if (diff==1||diff==2)count++;
    }
   return count;
   }

}
