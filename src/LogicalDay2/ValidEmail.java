package LogicalDay2;

public class ValidEmail {
    public static void main(String[] args) {
        System.out.println(isValid("test@gmail.com"));
        System.out.println(isValid("invalid@com"));
    }

    static boolean isValid(String email) {
        String constraint = "@gmail.com";
        return email.indexOf(constraint) != -1;
    }
}
