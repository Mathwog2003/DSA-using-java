public class UnderstandRecursion {
    static int cnt = 0;
    public static void recursion()
    {
        if(cnt >= 3)
        {
            return;
        }
        System.out.println(cnt);
        cnt++;
        recursion();

    }
    public static void main(String args[])
    {
        recursion();
    }
}
