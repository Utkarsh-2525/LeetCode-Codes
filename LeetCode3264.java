import java.util.Arrays;

public class LeetCode3264 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,5,6};
        int k = 4, multiplier = 4;
        while(k > 0)
        {
            int min = nums[0];
            int idx = 0;
            for(int i = 1; i < nums.length; i++)
                if(nums[i] < min){
                    min = nums[i];
                    idx = i;
                }
            nums[idx] *= multiplier;
            --k;
            System.out.println(Arrays.toString(nums));
        }
    }
}
