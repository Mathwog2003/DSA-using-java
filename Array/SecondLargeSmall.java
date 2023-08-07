import java.util.*;
public class SecondLargeSmall{
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        Arrays.sort(a);
        int larg = a[n-2];
        int small = a[1];
        int result[] = new int[2];
        result[0] = larg;
        result[1] = small;

        return result;
    }
}
