import java.util.Arrays;

public class SecondLargestElement{
    public static int getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int[] small = a[n-2];
        int[] largest = a[1];

        System.out.println(second_small+" "+second_largest);
        return small,largest;
    }
}
