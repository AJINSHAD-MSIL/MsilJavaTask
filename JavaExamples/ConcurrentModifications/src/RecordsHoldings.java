import java.util.ArrayList;
import java.util.List;

public class RecordsHoldings {
    public void addRecords() {
        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Programming in Java");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Improve Java");
        listOfBooks.add("Complete learning");

        for (String book : listOfBooks) {
            System.out.println(book);
            if (book.contains("Clean Code")) {
                listOfBooks.remove(book);
            }
        }
    }
}
