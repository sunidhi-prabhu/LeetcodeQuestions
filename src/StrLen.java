//Given a string calculate length of the string using recursion.
public class StrLen {
    public static void main(String[] args) {
        String a = "abcd";
        int res = Strlen(a);
        System.out.println(res);
    }

    private static int Strlen(String a) {
        if(a.isEmpty())
            return 0;
       return 1 + Strlen(a.substring(1));

    }
}
