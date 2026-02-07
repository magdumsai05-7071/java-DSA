class p10 {
    public static void main(String[] args) {

        int n = 5;

        // Upper Pyramid
        for (int i = 0; i < n; i++) {

            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Inverted Pyramid
        for (int i = n - 2; i >= 0; i--) {

            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
