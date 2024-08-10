void main(){
    System.out.println(reversePrefix("abcdefd", 'd'));
}
public String reversePrefix(String word, char ch) {
    if(word.indexOf(ch)==-1)
        return word;
    StringBuilder stb = new StringBuilder();
    stb.append(word.substring(0,word.indexOf(ch)+1));
    word = (stb.reverse()+word.substring(word.indexOf(ch)+1)).toString();
    return word;
}