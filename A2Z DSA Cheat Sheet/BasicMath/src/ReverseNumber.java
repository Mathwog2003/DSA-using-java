import java.util.* ;
import java.io.*;

public class ReverseNumber{
    public static long reverseNumber(long n) {
        // Write your code here
        long rev=0;
        while(n>0)
        {
            long ld = n%10;
            rev= (rev*10)+ld;
            n = n/10;
        }
        return rev;
    }


}
