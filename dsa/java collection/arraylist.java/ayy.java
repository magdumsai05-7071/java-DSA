import java.util.ArrayList;

public class ayy{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
       
       
        name.add("Sai");
        name.add("mur");
        name.add("saiii");
        name.add("sumer");
       System.out.println(name);




       // Accessing element
       System.out.println("name"+name.get(0));


       //removing element
             name.remove(2);
             System.out.println(name);


             //set update the element
              name.set(1,"summit");
              System.out.println(name );


              //size of arraylist
              System.out.println("size"+ name.size());

              //checking 
              System.out.println("cotains sumit" +name.contains("sumit"));

              
        // Iterating using for-each loop
        System.out.println("All names:");
        for (String names : name) {
            System.out.println(name);
        }
    }
    }
