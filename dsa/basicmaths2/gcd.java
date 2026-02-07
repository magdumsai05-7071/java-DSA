public class gcd {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        for (int i = 1 ; i<=n1 ; i++){
            if(n1%i==0 && n2% i==0){
                System.out.println(i);
            }
        }
    }
}
