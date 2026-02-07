public class CountDigitsLog {

    static int count(int n) {
        if (n == 0)        // special case
            return 1;

        n = Math.abs(n);  // handle negative numbers

        int cnt = (int)(Math.log10(n) + 1);
        return cnt;
    }

    public static void main(String[] args) {
        int num = 4567;
        System.out.println("Number of digits = " + count(num));
    }
}
