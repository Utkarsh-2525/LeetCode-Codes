void main(){
    String s = "a2b3c4d5e6f7g8h9";
    int k=10;
    if (s.substring(1).matches("[0-9]+"))
        System.out.println(""+s.charAt(0));
    String str="";
    for(int i=0;i<s.length();i++)
    {
        if(Character.isLetter(s.charAt(i)))
            str+=s.charAt(i);
        else if(Character.isDigit(s.charAt(i)))
        {
            int n=s.charAt(i)-'1';
            System.out.println(n);
            String temp=str;
            while(n-- > 0)
                str+=temp;
        }
        if(str.length()>=k)
            break;
    }
    System.out.println(str);
//    System.out.println(str.equals("leetleetcodeleetleetcodeleetleetcode"));
    System.out.println(""+str.charAt(k-1));
}