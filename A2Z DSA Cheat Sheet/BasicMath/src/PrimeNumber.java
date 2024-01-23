import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        //Your code goes here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(primeNumber(n));
    }

    // BRUTE FORCE
// public static boolean primeNumber(int n)
//     {
//         int cnt = 0;
//         for(int i = 1; i<=n ; i++)
//         {
//             if(n%i==0)
//             {
//                cnt++;
//             }
//         }
//         if(cnt == 2)
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }

    public static boolean primeNumber(int n)
    {
        int cnt = 0;
        for(int i = 1; i*i<=n ; i++)
        {
            if(n%i == 0){
                cnt++;
                if((n/i) != i)
                {
                    cnt++;
                }
            }
        }
        if(cnt == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}