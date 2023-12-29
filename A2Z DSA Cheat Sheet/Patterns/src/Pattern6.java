import java.util.Scanner;
public class Pattern6 {

    public static void square(int a) {
        for(int i = 1 ; i <= a ; i++)
        {
            for(int j = a ; j >= i ; j--)
            {
                System.out.print(a-j+1);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        square(input);
    }
}