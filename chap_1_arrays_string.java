import java.util.Arrays;


public class Main {
  public static boolean isUniqueChars(String str) {
    if (str.length() > 128) {
      return false;
    }
    boolean[] char_set = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);
      if (char_set[val])
        return false;
      char_set[val] = true;
    }
    return true;
  }
  
  public static boolean isUniqueCharsNoDataStructure(String str) {
    if (str.length() > 26) {return false;} //assume all lower case a-z
    char[] sortedStringChar = str.toCharArray();
    Arrays.sort(sortedStringChar);
    for (int i = 1; i < sortedStringChar.length; i++){
    if (sortedStringChar[i] == sortedStringChar[i-1]) {return false;}
    }
    return true;
  }
  
  public static void main(String[] args) {
    String[] words = { "abcde", "hello", "apple", "kite", "padle","abcda"};
    for (String word : words) {
      System.out.println(word + ": " + isUniqueCharsNoDataStructure(word));
    }
  }
}
