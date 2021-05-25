/**
* class Anagram reads in one string argument, compares it to str2.
* Return true if both strings contain the same set and frequency of alphabetic characters.
*/

import java.util.*;

class Anagram {
   public static void main (String args[]) {
      String str1 = args[0];
      String str2 = "conversation";
      
      // build Map representations of both Strings
      Map<Character, Integer> map1 = makeMap(str1);
      Map<Character, Integer> map2 = makeMap(str2);
      
      System.out.println("is " +str1 +" anagram of " +str2 +"? " +(map1.equals(map2)));
   }
   
   // makeMap helper method, returns a Map of the String - ignoring any whitespace and uppercase
   static Map<Character, Integer> makeMap (String str) {
      Map<Character, Integer> retmap = new HashMap<>();
      for (int i = 0; i < str.length(); i++) {
         Character thischar = (Character)str.charAt(i);
         // only add alphabet chars to the comparison Maps
         if (Character.isAlphabetic(thischar)) {
            // all chars in the Map are lowercase           
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
