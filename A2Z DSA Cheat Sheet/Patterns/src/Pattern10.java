import java.util.Scanner;
public class Pattern10 {
    public static void square(int N)
    {
        for(int i = 1 ; i <+ N ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void square2(int N)
    {
        for(int i = 1 ; i <+ N ; i++)
        {
            for(int j = N ; j > i ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        square(userInput);
        square2(userInput);
    }
}
