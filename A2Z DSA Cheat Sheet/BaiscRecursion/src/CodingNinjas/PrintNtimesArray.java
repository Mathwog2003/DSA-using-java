package CodingNinjas;

public class PrintNtimesArray {
    public static int[] printNos(int x) {
        // Write Your Code Here
        return  printNos2(1,x);
    }

    public static int[] printNos2(int i, int x)
    {
        if(i>x)
        {
            return new int[0];
        }
        int arr[] = printNos2(i+1,x);
        arr[i-1] = i;
        return arr;
    }
}