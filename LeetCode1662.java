void main(){
    String[] word1 = {"ab","c"};
    String[] word2 = {"a","bc"};
    System.out.println(arrayStringsAreEqual(word1,word2));
}
public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String w1="", w2="";
    for(String str:word1)
        w1+=str;
    for(String str:word2)
        w2+=str;
    System.out.println(w1+" "+w2);
    return w1.equals(w2);
}