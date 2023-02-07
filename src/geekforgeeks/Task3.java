package geekforgeeks;

public class Task3 {
    public static void main(String[] args) {
        String  S1 = "Practice" , S2 = "Geeks";
        System.out.println(conRevstr(S1,S2));
    }
    public static String conRevstr(String S1, String S2) {
        String s = S1.concat(S2);
        char[] c = s.toCharArray();
        String rev = "";
        for (int i = c.length-1; i >= 0 ; i--) {
            rev+=c[i];
        }
        return rev;
    }
}
