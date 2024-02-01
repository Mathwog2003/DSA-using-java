public class PalindromeString{
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return isPalindrome2(0,str);
    }
    public static boolean isPalindrome2(int i, String str)
    {
        if(i>str.length()/2)
        {
            return true;
        }
        if(str.charAt(i)!=str.charAt((str.length())-i-1))
        {
            return false;
        }
        return isPalindrome2(i+1,str);
    }
}

