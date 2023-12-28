import java.util.Scanner;
public class Pattern1 {

    public static void square(int a) {
        for(int i = 0 ; i < a ; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
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