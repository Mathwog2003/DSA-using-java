public class SumFirstN {
    public static void sumFirstN(long n) {
        // Write your code here.
//        if(n == 0)
//        {
//            return 0;
//        }
//        return n + sumFirstN(n-1);

         sumFirstN2(n,0);
    }
    public static void sumFirstN2(long n, long sum)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;
        }
        sumFirstN2(n-1,sum+n);
    }
    public static void main(String args[])
    {
    sumFirstN(3);
    }

}