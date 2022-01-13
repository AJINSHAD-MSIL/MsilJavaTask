import java.util.Scanner;

@FunctionalInterface
interface GenericInterface<T> {
    T func(T t);
}

public class LambdaExp1 {

public void lambdaExample1()
{
 GenericInterface<String> reverse = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a string");
        String input = scanner.nextLine();
        System.out.println("Lambda reversed = " + reverse.func(input));

        GenericInterface<Integer> factorial = (n) -> {

            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Enter an integer");
        int number = scanner.nextInt();

        System.out.println("factorial of "+number+" = " + factorial.func(number));
    }
}