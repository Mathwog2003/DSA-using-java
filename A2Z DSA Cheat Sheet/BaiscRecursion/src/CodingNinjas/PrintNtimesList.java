package CodingNinjas;

import java.util.List;
import java.util.ArrayList;
public class PrintNtimesList {
    public static List<String> printNtimes(int n){
        // Write your code here.
        return printNtimes2(1, n);

    }
    public static List<String> printNtimes2(int i, int n)
    {
        if(i>n)
        {
            return new ArrayList<String>();
        }
        List<String> li = printNtimes2( i+1, n);
        li.add("Coding Ninjas");
        return li;
    }
}