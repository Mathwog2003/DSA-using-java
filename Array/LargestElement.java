import java.util.* ;
import java.io.*; 

public class LargestElement{

    static int lar = 0;
    static int largestElement(int[] arr, int n) {
        
        // Write your code here.
        for(int i = 0; i<n; i++)
        {   
            
            if(arr[i]>lar)
            {
                lar = arr[i];
            }
           
        }
         return lar;

    }
}
