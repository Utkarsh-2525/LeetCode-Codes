void main(){
    int start = 10;
    int goal = 7;
    int min = 0, diff = 0;
    String str="";
    String num1 = Integer.toBinaryString(start);
    String num2 = Integer.toBinaryString(goal);

    if(num1.length()!=num2.length())
    {
        min = (num1.length() < num2.length()) ? 1 : 2;
        diff = Math.max(num1.length(),num1.length()) - Math.min(num1.length(),num1.length());
        str = (min == 1) ? num1 : num2;
        while(diff-- > 0)
            str = '0'+str;
    }
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(min);
    System.out.println(diff);
    System.out.println(str);
}