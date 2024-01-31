public class UnderstandRecursion {
    static int cnt = 0;
    public static int recursion()
    {
        if(cnt < 2)
        {
            System.out.println("hi");
            cnt++;
            recursion();
        }


        return 0;
    }
    public static void main(String args[])
    {
        System.out.println(recursion());
    }
}
