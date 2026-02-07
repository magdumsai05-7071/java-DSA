import java.util.LinkedList;

public class linkked {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("sai");
        name.add("sumit");
        name.add("sager");

        System.out.println(name);

        name.addFirst("saiii");
        name.addLast("shweat");

        System.out.println(name);
        

        System.out.println("name get the 1"+name.get(1));

        name.removeFirst();
        name.remove(2);

        System.out.println("rmove name see "+ name);

        System.out.println(name.contains("sai"));


        System.out.println("all name ");
        for(String names : name ){
            System.out.print(name);
        }
    }
}
