public class UnderstandRecursion {
    static int cnt = 0;
    public static int recursion()
    {
        if(cnt <= 3)
        {
            System.out.println(cnt);
            cnt++;
            recursion();
            return cnt;
        }


        return 0;
    }
    public static void main(String args[])
    {
        System.out.println(recursion());
    }
}
