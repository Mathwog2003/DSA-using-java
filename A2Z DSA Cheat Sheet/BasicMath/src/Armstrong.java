import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        // Write your code here


    }
    public static boolean armstrong(int N)
    {
        int arm = 0;
        int ls = 0;
        int count = 0;
        int dup = N;
        while(N>0)
        {
            N = N/10;
            count++;
        }
        N = dup;
        while(N>0)
        {
            ls = N%10;
            arm = (int)(arm + (Math.pow(ls, count)));
            N = N/10;
        }
        if(arm == dup)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
