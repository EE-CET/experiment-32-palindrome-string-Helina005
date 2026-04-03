       import java.util.Scanner;
public class Palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) return;
        String s = sc.next();
        
        // Convert to lowercase to handle case-insensitivity (like Malayalam)
        String lowerS = s.toLowerCase();
        
        if (isPalindrome(lowerS)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        sc.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // If characters at both ends don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
