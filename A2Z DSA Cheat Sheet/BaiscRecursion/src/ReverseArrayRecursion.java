public class ReverseArrayRecursion {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        return reverseArray2(0,n-1,nums);
    }
    public static int[] reverseArray2(int start , int end, int []nums)
    {
        if(start<end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            reverseArray2(start+1,end-1,nums);
        }
        return nums;
    }

}
