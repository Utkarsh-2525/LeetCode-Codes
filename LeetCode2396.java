void main(){
    int number = 9;
    System.out.print(isStrictlyPalindromic(number));
}
public boolean isStrictlyPalindromic(int n) {
    String number=""+n;
    for(int i=2;i<n-1;i++)
    {
        String str = Integer.toString(Integer.parseInt(number), i);
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        if (!str.equals(str1.toString()))
            return false;
    }
    return true;
}