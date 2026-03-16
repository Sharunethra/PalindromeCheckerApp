import java.util.*;

public class PalindromeCheckerApp {
    public static boolean reverseMethod(String input)
    {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
    public static boolean twoPointerMethod(String input)
    {
        int left = 0;
        int right = input.length() - 1;
        while (left < right)
        {
            if (input.charAt(left) != input.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        input = input.replaceAll("\\s+", "").toLowerCase();
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;
        System.out.println("\nUsing Reverse Method:");
        System.out.println("Is Palindrome? : " + result1);
        System.out.println("Execution Time : " + time1 + " ns");
        System.out.println("\nUsing Two Pointer Method:");
        System.out.println("Is Palindrome? : " + result2);
        System.out.println("Execution Time : " + time2 + " ns");
        sc.close();
    }
}
