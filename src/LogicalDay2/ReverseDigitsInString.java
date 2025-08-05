package LogicalDay2;

public class ReverseDigitsInString {
    public static void main(String[] args) {
        System.out.println(reverseDigits("a1b2c3d4"));
    }

    static String reverseDigits(String st) {
        char[] chs = st.toCharArray();
        int start = 0;
        int end = st.length() - 1;
        boolean startPointer = false;
        boolean endPointer = false;
        while (start < end) {
            if (chs[start] >= '0' && chs[start] <= '9') {
                startPointer = true;
            }
            if (chs[end] >= '0' && chs[end] <= '9') {
                endPointer = true;
            }
            if (startPointer && endPointer) {
                reverse(chs, start, end);
                startPointer = false;
                endPointer = false;
            }
            if (!startPointer) start++;
            if (!endPointer) end--;
        }
        return new String(chs);
    }
    static void reverse(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }
}
