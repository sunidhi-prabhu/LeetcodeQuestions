//return all the combinations of the given string without repetition in arraylist and without function call.
package Strings_SubStrings;
import java.util.ArrayList;

public class ComboOfString {
    public static void main(String[] args) {
        ArrayList ans = combinationList("","abc");//calling the function with arraylist
        System.out.println(ans);
        combination("","abc");//calling the function with no return type
    }
    static ArrayList<String> combinationList(String p, String up){
        if(up.isEmpty()) {
            ArrayList list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList left = combinationList( p +  ch , up.substring(1));
        ArrayList right = combinationList(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    static void combination(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        combination( p +  ch , up.substring(1));
        combination(p,up.substring(1));
    }
}
