public class LeetCode2825 {
    void main() {
        String str1 = "zc";
        String str2 = "ad";
//        if (str1.length() < str2.length())
//            return false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int i = 0, j = 0;

//        System.out.println((char)(arr1[i]+1) + " " + arr2[j]);
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else if ((char)(((arr1[i] - 'a' + 1) % 26) + 'a') == arr2[j]) {
                System.out.println((char)(((arr1[i] - 'a' + 1) % 26) + 'a') + " " + arr2[j]);
                i++;
                j++;
            } else {
                i++;
            }
        }

// Ensure the entire `str2` was successfully matched
        System.out.println(j == arr2.length);
    }
}
