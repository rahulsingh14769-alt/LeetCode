import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()) {
            char[] charArrayS = s.toCharArray();
            char[] charArrayT = t.toCharArray();
            Arrays.sort(charArrayS);
            Arrays.sort(charArrayT);
            return Arrays.equals(charArrayS, charArrayT);
        } 
        return false;
    }
}
