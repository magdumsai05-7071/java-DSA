public class gcd2 {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        int min = (n1 < n2) ? n1 : n2;   // find smaller number

        for (int i = min; i >= 1; i--) {


            if(n1%i==0&& n2%i==0){
                System.out.println(i);
            }
        }
    }}
