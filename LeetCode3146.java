void main(){
    System.out.println(findPermutationDifference("abc", "bac"));
}
public int findPermutationDifference(String s, String t) {
    int diff = 0;
    for(int i=0;i<s.length();i++)
    {
        diff += Math.abs(s.indexOf(s.charAt(i)) - t.indexOf(s.charAt(i)));
    }
    return diff;
}