public class LeetCode5 {
    public static void main(String[] args) {
        String s1 = "babad";
        int len = s1.length();
        while (len > 0) {
            if (s1.equals(new StringBuilder(s1).reverse().toString())) {
                System.out.println(s1+" "+ new StringBuilder(s1).reverse().toString());
            }
            else
                s1 = s1.substring(0, len);
            --len;
        }
    }
}
