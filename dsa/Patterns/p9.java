class p9{
    public static void main(String[] args) {
        int n = 4;
        for(int i =0; i<n ; i++){
        // space
        for(int j = 0; j<=i;j++){
            System.out.println("");
        }
        for(int j =0;j<=2*n*(2*i+1);j++){
            System.out.println("*");

        }
         for(int j = 0; j<=i;j++){
            System.out.println("");

         }
        }
        System.out.println();
    }
}




