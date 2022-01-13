import java.util.ArrayList;
import java.util.List;

public class Records
{
    public void storerecords() {
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("Programming in Java");
        listOfNames.add("Clean Code");
        listOfNames.add("Improve Java");
        listOfNames.add(".com");
        listOfNames.add("Complete learning");

        // Traversing the names from ArrayList
        for (int i = 0; i < listOfNames.size(); i++) {
            System.out.println(listOfNames.get(i));
            // Modifying the ArrayList if condition is true
            if (listOfNames.get(i).equals("Complete learning"))
                listOfNames.remove(listOfNames.get(i));
        }
    }
}