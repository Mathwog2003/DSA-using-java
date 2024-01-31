public class OntToNbackwards {
    public static void print(int n)
    {
//        if(i>n)
//        {
//            return;
//        }
//        System.out.println(n);
//        print(i,n-1);

        if(n<0)
        {
            return;
        }
        System.out.println(n);
        n= n-1;
        print(n);
    }
    public static void main(String args[])
    {
        print(5);
    }
}
