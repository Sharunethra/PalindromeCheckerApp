import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++)
        {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i))
            {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
