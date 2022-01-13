import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcurrentModification
{
    public static void main(String[]args)
    {
        RecordsHoldings holdings = new RecordsHoldings();
        Records records = new Records();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.show Concurrent modification\n2.avoiding concurrent modification\nchoose any one");
          int input = scanner.nextInt();
           switch (input)
           {
               case 1:  holdings.addRecords();
               break;
               case 2: records.storerecords();
               break;
               default:break;
           }
    }
}
