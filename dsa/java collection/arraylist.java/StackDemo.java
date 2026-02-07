
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();

        name.push("sai");
        name.push("sumer");
        name.push("mur");


        System.out.println(name);


        //top element
         System.out.println(name.peek());

         //remove top  
         System.out.print(name.pop());

        System.out.println(name);

         //check empty
         System.out.println(name.empty());

         System.out.println(name.search("sai"));


         System.out.println("All elements:");
        for (String nameString : name){
            System.out.println(nameString);
    }
}
}
