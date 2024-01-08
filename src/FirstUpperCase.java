public class FirstUpperCase {
    public static void main(String[] args) {
        String a = "LeetCoDe";
        isupper(a);
    }
    private static void isupper(String a) {

        if(a==null)
            return;

       char b = a.charAt(0);
       if(Character.isUpperCase(b)) {
           System.out.println(b);
           return;
       }

       isupper(a.substring(1));
    }
}
