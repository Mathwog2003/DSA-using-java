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
        int count = (int)(Math.log10(x)+1);
        return count;
    }
}