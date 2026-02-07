public class sai {
    public static void main(String[] args){
        int x = 371;
        int sum = 0;
        int dup = x;

        while(x >0){
            int lastdigit = x%10;
            sum = sum+(lastdigit*lastdigit*lastdigit);
        }
        if(sum == dup){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}


