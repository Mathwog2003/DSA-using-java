public class ArrayReverse {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int fe = 0, le = n-1;
        for(int i =0;i<n;i++)
        {
            while(fe<le)
            {
                int temp = nums[le];
                nums[le] = nums[fe];
                nums[fe] = temp;
                fe++;
                le--;
            }

        }
        return nums;
    }
}
