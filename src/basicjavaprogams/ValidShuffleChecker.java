package basicjavaprogams;

public class ValidShuffleChecker {

    public static boolean isValidShuffle(String first, String second, String third) {
        // Check if lengths don't match
        if (first.length() + second.length() != third.length()) {
            return false;
        }

        // Pointers for first, second, and third strings
        int i = 0, j = 0, k = 0;

        // Traverse through third string
        while (k < third.length()) {
            // If character matches the current character in `first`
            if (i < first.length() && first.charAt(i) == third.charAt(k)) {
                i++;
            }
            // If character matches the current character in `second`
            else if (j < second.length() && second.charAt(j) == third.charAt(k)) {
                j++;
            }
            // If character doesn't match either
            else {
                return false;
            }
            k++;
        }

        // Ensure all characters in `first` and `second` are used
        return i == first.length() && j == second.length();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidShuffle("abc", "def", "adbcef")); // true
        System.out.println(isValidShuffle("abc", "def", "abdecf")); // false
        System.out.println(isValidShuffle("abc", "def", "acbedf")); 
        System.out.println(isValidShuffle("abc", "123", "a1b2c3")); // true
        System.out.println(isValidShuffle("", "def", "def")); // true
        System.out.println(isValidShuffle("abc", "", "abc")); // true
        System.out.println(isValidShuffle("abc", "def", "abcdefg")); // false
        System.out.println(isValidShuffle("aaa", "bbb", "ababab")); // true
    }
}

