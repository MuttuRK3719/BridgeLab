package LogicalDay2;

public class NumberIsReversible {
    public static void main(String[] args) {
        System.out.println(isValid(36));
    }

    static boolean isValid(int n) {
        int sum = n + reverseNumber(n);
        return isOddDigites(sum);
    }

    static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    static boolean isOddDigites(int num) {
        while (num != 0) {
            int d = num % 10;
            if (d % 2 == 0) return false;
            num /= 10;
        }
        return true;
    }
}
