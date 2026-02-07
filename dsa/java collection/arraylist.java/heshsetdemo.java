
import java.util.HashSet;

public class heshsetdemo {
    public static void main(String[] args) {
        HashSet<String>name = new HashSet<>();


        name.add("sai");
        name .add("sumit");
        name.add("shweta ");


        System.out.println(name);


        //remove element 
       name.remove("sai");

       System.out.println(name);

// / Check element
       System.out.println("check element"+name.contains("sai"));

    //size 
    System.out.println(name.size());

    System.out.println("All element");
    for(String names : name){
        System.out.println(name);
    }
    
    }
}
