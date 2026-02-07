public class AlphabetPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print increasing letters
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            // Print decreasing letters
            ch -= 2;
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }
    }
}
