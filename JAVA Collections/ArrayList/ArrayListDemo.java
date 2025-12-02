import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // We can add duplicates on ArrayList
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");
        list.add("element3");
        list.add("element3");

        System.out.println(list);

        // Also we can add null values on ArrayList

        list.add(null);
        list.add(null);

        System.out.println(list);

        // To access specific elements in the ArrayList


        System.out.println(list.get(0));  /* We can use the .get method with defining the index inside to access specific elements from the ArrayList */


        // ArrayList implements List interface and the List interface implements Collections
    }
}