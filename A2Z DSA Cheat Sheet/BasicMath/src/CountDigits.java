import java.util.* ;
import java.io.*;

public class CountDigits {
    static int countDigit(long x) {
        // Write your code here.

        // int count = 0;
        // while(x>0)
        // {
        //     long lastdigit = x%10;
        //     count += 1;
        //     x = x/10;
        // }
        // return count;

        //Time complexity is o(log10(X))
        //Number of iteration is based on division TC will be logarithmetic
        int count = (int)(Math.log10(x)+1);
        return count;
    }
}