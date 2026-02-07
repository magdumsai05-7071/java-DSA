public class palindrome {
    public static void main(String[] args) {

        int n = 1221;
        int rev = 0;

        int dup = n;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed number = " + rev);

        if(rev == dup) {
            System.out.println("true");
        }else{
                System.out.println("not true");
            }
    }
}


