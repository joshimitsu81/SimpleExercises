import java.util.*;

class Anagram {
   public static void main (String args[]) {
      String str1 = args[0];
      String str2 = "conversation";
      
      Map<Character, Integer> map1 = makeMap(str1);
      Map<Character, Integer> map2 = makeMap(str2);
      
      System.out.println("is " +str1 +" anagram of " +str2 +"? " +(map1.equals(map2)));
   }
   
   static Map<Character, Integer> makeMap (String str) {
      Map<Character, Integer> retmap = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
         Character thischar = (Character)str.charAt(i);
         if (Character.isAlphabetic(thischar)) {
            thischar = Character.toLowerCase(thischar);
            if (retmap.containsKey(thischar)) {
               retmap.put(thischar, retmap.get(thischar) +1);
            } else {
               retmap.put(thischar, 1);
            }
         }
      }
      
      return retmap;
   }
}