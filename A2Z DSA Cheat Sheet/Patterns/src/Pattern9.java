import java.util.Scanner;
public class Pattern9 {

    public static void square(int a) {
        for(int i = 0 ; i < a ; i++)
        {
            for(int j = 0 ; j < a-i-1 ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*i+1 ; j++)
            {
                System.out.print("*");
            }
            for(int j = 0 ; j < a-i-1 ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void square2(int a) {
        for(int i = 0 ; i < a ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2*a - (2*i+1) ; j++)
            {
                System.out.print("*");
            }
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        square(input);
        square2(input);

    }
}