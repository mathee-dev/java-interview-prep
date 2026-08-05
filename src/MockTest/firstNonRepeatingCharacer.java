package MockTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingCharacer {
    public static void main(String[] args){
        System.out.println(firstUniqueCharacter("loveleetcode"));
        System.out.println(firstUniqueCharacter("leetcode"));
        System.out.println(firstUniqueCharacter("aabb"));
        System.out.println(firstUniqueCharacter("zza"));
        System.out.println(firstUniqueCharacter("swiss"));
        System.out.println(firstUniqueCharacter("aadadaad"));
    }
    static int firstUniqueCharacter(String text){
        //Don't need to use LinkedHashMap as the text perserves the order
        HashMap<Character,Integer> uniqueCharacters = new HashMap<>(text.length());

        //Use getOrDefault instead of having one for loop to put the values and another to increment it 
        for (int i = 0; i<text.length();i++){
            uniqueCharacters.put(text.charAt(i), uniqueCharacters.getOrDefault(text.charAt(i), 0)+1);
        }

        for (int i = 0;i<text.length();i++){
            if (uniqueCharacters.get(text.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    
}
