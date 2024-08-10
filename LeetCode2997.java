void main() {
    int[] nums = {3,13,9,8,5,18,11,10};
    int k = 13;
    int xor = 0;
    for(int i:nums)
        xor^=i;
    int diff = xor ^ k;
    System.out.println(Integer.bitCount(diff));
}