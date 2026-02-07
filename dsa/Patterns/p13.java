public class p13 {
    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // Left numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right numbers (reverse)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
