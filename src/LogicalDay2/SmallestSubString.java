package LogicalDay2;

public class SmallestSubString {
    public static void main(String[] args) {
        System.out.println(smallestSubString("abcabcabc"));
    }
    static String smallestSubString(String st){
        int n=st.length();
        for (int i = 1; i <n/2; i++) {
        if(n%i==0){
            String pattern=st.substring(0,i);
            StringBuilder sb=new StringBuilder();
            for (int j = 0; j < n/i; j++) {
                sb.append(pattern);
            }
            if(sb.toString().equals(st)) return pattern;
        }
        }
        return st;
    }

}
