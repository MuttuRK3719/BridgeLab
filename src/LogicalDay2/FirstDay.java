package LogicalDay2;

public class FirstDay {
    public static void main(String[] args) {
        System.out.println(validword("abidee"));
        int[] arr = {101, 103, 102
                , 104};
        System.out.println(orderOfPassenger(arr));
    }

    static String validword(String st) {
        String vowel = "aeiou";
        int count = 0;
        if (vowel.indexOf(st.charAt(0)) == -1
                || vowel.indexOf(st.charAt(st.length() - 1)) == -1)
            return "Invalid";

        for (int i = 1; i < st.length() - 1; i++) {
            if (vowel.indexOf(st.charAt(i)) != -1) count++;
            if (count > 2) return "Invalid";
        }
        return count == 2 ? "Valid" : "Invalid";
    }

    static int orderOfPassenger(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return count;
            else count++;
        }
        return count;
    }
}
