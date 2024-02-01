public class FactorialUsingRecurison {
    public static long sumFirstN(long n) {
        // Write your code here.
        if(n == 0)
        {
            return 1;
        }
        return n * sumFirstN(n-1);
    }
    public static void main(String args[])
    {
        System.out.println(sumFirstN(3));
    }
}
