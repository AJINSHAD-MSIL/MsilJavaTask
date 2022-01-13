import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        LambdasExampel2 lambdasExampel2= new LambdasExampel2();
        LambdaExp1 lambdaExp1= new LambdaExp1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.lambdaExample1\n2.lambdaExample2\nEnter your choice");
        int input  = scanner.nextInt();
        switch (input)
        {
            case 1 : lambdasExampel2.LambdaExamples();
                      break;
            case 2: lambdaExp1.lambdaExample1();
            break;
            default:break;
        }

        scanner.close();
    }
}
