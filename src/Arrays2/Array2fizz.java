import java.util.Scanner;

public class Array2fizz      {

   public static void main (String args[]) {
    Scanner intake = new Scanner(System.in);
    System.out.println("String:");
    String input1 = intake.nextLine();
    int numin = Integer.parseInt(input1);
    String inparray[] = input1.split(", ");
    int size = inparray.length;
    int [] convarray = new int [size];
      for(int i=0; i<size; i++) {
         convarray[i] = Integer.parseInt(inparray[i]);
      }
    System.out.println(fizz(numin));
   }
   
   public static int[] fizz(int inbound) {
    int[] fizzarray = new int[inbound];
    
    for (int i=0; i<inbound; i++) {
      fizzarray[i] = i;
    }
   return fizzarray;
   }

}
