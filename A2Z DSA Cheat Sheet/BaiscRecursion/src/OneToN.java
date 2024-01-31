public class OneToN{
    public static void name(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        name(i+1,n);
    }

    public static void main(String args[])
    {
        name(1,5);
    }
}
