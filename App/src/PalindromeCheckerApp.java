import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String s = sc.nextLine();
        s = s.replaceAll("\\s+", "").toLowerCase();
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(s);
        System.out.println("Is Palindrome? : " + result);
    }
}
class PalindromeChecker
{
    public boolean checkPalindrome(String s)
    {
        int start = 0;
        int end = s.length() - 1;
        while (start < end)
        {
            if (s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

