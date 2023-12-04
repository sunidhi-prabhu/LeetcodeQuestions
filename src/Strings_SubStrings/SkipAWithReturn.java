//return a string without 'a' in the string using recursion and return type
package Strings_SubStrings;

public class SkipAWithReturn {
    public static void main(String[] args) {
        String ans = skip("abcdabcdabcd");
        System.out.println(ans);
    }

    static String skip(  String up){
        if(up.isEmpty()) //return if the unprocessed is empty which indicates that the whole string was checked for the presence of 'a'.
            return ("");

        char ch =up.charAt(0);
        if(ch == 'a')
           return skip(up.substring(1));//if 'a' just skip it and go to next char.
        else
            return ch + skip(up.substring(1 ));//if not 'a' add it to the ans which is processed.
    }
}
