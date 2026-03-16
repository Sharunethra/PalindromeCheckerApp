import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        input = input.replaceAll("\\s+", "").toLowerCase();
        System.out.println("\nChoose Strategy");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        PalindromeStrategy strategy;
        if (choice == 1)
        {
            strategy = new StackStrategy();
        }
        else
        {
            strategy = new DequeStrategy();
        }
        boolean result = strategy.check(input);
        System.out.println("Is Palindrome? : " + result);
    }
}
interface PalindromeStrategy
{
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy
{
    public boolean check(String input)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray())
        {
            stack.push(c);
        }
        for(char c : input.toCharArray())
        {
            if(c != stack.pop())
            {
                return false;
            }
        }
        return true;
    }
}
class DequeStrategy implements PalindromeStrategy
{
    public boolean check(String input)
    {
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : input.toCharArray())
        {
            deque.addLast(c);
        }
        while(deque.size() > 1)
        {
            if(deque.removeFirst() != deque.removeLast())
            {
                return false;
            }
        }
        return true;
    }
}
