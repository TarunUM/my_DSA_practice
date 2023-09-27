import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TempQtns {
    public static void main(String[] args) {
        System.out.println(isAnagram2("anagram", "nagaram"));
        System.out.println(isAnagram2("ac", "bb"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // map ( char , counter )
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i=0; i<t.length();i++){
            char ch = t.charAt(i);
            if (!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }

    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] s1  = new int[26];
        int[] s2  = new int[26];
        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            s1[currChar - 'a']++;
        }
        for(int i=0;i<t.length();i++) {
            char currChar = t.charAt(i);
            s2[currChar - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }

}
