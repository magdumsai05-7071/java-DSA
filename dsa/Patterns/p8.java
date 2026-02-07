class p8{
    public static void main(String[] args) {
        int n = 4;
        for(int i =0; i<n ; i++){
        // space
        for(int j = 0; j<=n-i-1;j++){
            System.out.println("");
        }
        for(int j =0;j<=2*i+1;j++){
            System.out.println("*");

        }
         for(int j = 0; j<=n-i-1;j++){
            System.out.println("");

         }
        }
        System.out.println();
    }
}





// code the give by the Al

// class p8 {
//     public static void main(String[] args) {

//         int n = 5;   // number of rows

//         for (int i = 0; i < n; i++) {

//             // print spaces
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }

//             // print stars
//             for (int j = 0; j < 2 * i + 1; j++) {
//                 System.out.print("*");
//             }

//             // move to next line after each row
//             System.out.println();
//         }
//     }
// }
