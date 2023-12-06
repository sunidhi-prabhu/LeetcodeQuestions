//skip a part of string and return the rest of string

package Strings_SubStrings;

public class SkipApple {
    public static void main(String[] args) {
        String ans = skipApple("abcdapplee");
        System.out.println(ans);
    }

    static String skipApple(String up){
        if(up.isEmpty())
            return ("");
        char ch = up.charAt(0);

        if(up.startsWith("apple"))//any required string that is to be removed can be passed here
            return skipApple(up.substring(5));

        else
            return up.charAt(0) + skipApple(up.substring(1));
    }


}
