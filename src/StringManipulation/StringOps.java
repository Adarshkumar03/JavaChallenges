package StringManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringOps {
    public String reverseString(String str){
        char[] charArr = str.toCharArray();
        int left = 0, right = charArr.length - 1;
        while(left < right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;

            left++;
            right--;
        }
        return new String(charArr);
    }

    public int numOfVowelsInString(String str){
        int count = 0;
        Set<Character> Vowels = new HashSet<>();
        for(char c: "AEIOUaeiou".toCharArray()){
            Vowels.add(c);
        }

        for(char c: str.toCharArray()){
            if(Vowels.contains(c)){
                count++;
            }
        }
        return count;
    }

    public boolean checkAnagram(String str1, String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();
        for(char c: str1.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for(char c: str2.toCharArray()){
            if(!mp.containsKey(c) || mp.get(c) == 0){
                return false;
            }
            mp.put(c, mp.get(c) - 1);
        }

        return true;
    }

}
