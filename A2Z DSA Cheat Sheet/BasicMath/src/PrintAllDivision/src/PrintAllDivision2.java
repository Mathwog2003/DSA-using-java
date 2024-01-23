package PrintAllDivision.src;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class PrintAllDivision2{
    public static List< Integer > printDivisors(int n) {

        List<Integer> divisors = new ArrayList<>();

        for(int i = 1; i<=(int)(Math.sqrt(n)) ; i++)
        {
            if(n%i == 0)
            {
                divisors.add(i);
                if(i != n/i)
                {
                    divisors.add(n/i);
                }
            }
            Collections.sort(divisors);
        }
        return divisors;

    }
}