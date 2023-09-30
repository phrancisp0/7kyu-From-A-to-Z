public class Solution{
  public static String gimmeTheLetters(String s){
    String result = "";
    for(int i=s.charAt(0);i<=s.charAt(2);i++) result += (char)i;
    return result;
  }
}
/*
Given a string indicating a range of letters, return a string which includes all the letters in that range, including the last letter. Note that if the range is given in capital letters, return the string in capitals also!

Examples
"a-z" ➞ "abcdefghijklmnopqrstuvwxyz"
"h-o" ➞ "hijklmno"
"Q-Z" ➞ "QRSTUVWXYZ"
"J-J" ➞ "J"
Notes
A hyphen will separate the two letters in the string.
You don't need to worry about error handling in this one (i.e. both letters will be the same case and the second letter will always be after the first alphabetically).
*/