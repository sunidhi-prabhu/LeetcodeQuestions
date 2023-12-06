//skip a part of string and return the rest of string

package Strings_SubStrings;

public class SkipApple {
    public static void main(String[] args) {
        String ans = skipAppnotapple("abcappledapp");//call the required the function
        System.out.println(ans);
    }

    static String skipApple(String up) {
        if (up.isEmpty())
            return ("");
        char ch = up.charAt(0);

        if (up.startsWith("apple"))//any required string that is to be removed can be passed here
            return skipApple(up.substring(5));

        else
            return up.charAt(0) + skipApple(up.substring(1));
    }


    static String skipAppnotapple(String up) {
        if (up.isEmpty())
            return ("");
        char ch = up.charAt(0);

        if (up.startsWith("app") && !up.startsWith("apple") )//any required string that is to be removed can be passed here
            return skipApple(up.substring(3));

        else
            return up.charAt(0) + skipAppnotapple(up.substring(1));
    }
}


