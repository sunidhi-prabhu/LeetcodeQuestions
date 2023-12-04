//Remove 'a' from the given string using recursion and substring method

package Strings_SubStrings;

public class SkipA {
    public static void main(String[] args) {
        skip("","ababababa");//calling the function
    }


    static void skip( String p, String up){

        if(up.isEmpty())//return if the unprocessed is empty which indicates that the whole string was checked for the presence of 'a'.
        {
            System.out.println(p);
            return;
        }

        char ch =up.charAt(0);
        if(ch == 'a')
            skip(p,up.substring(1));//if 'a' just skip it and go to next char.
        else
            skip(p + ch,up.substring(1 ));//if not 'a' add it to the ans which is processed.

    }
}
