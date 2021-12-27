package Student;
import java.util.Scanner;

import Student.RegisterStudent.Takeyourchoice;

public class Main {

	public static void main(String[] args) {
		StoreDetails details = new StoreDetails();
		Activities activity = new Activities();
		RegisterStudent registerstudent = new RegisterStudent();
		int cases;
		String result,mob;
		System.out.println("you can register directly or indirectly if duirect y else n");
		Scanner sc = new Scanner(System.in);
		result = sc.nextLine();
		
		if(result.equals("n"))
		{
		System.out.println("1."+Takeyourchoice.REGISTERSTUDENT.name() +"\t"+"2."+Takeyourchoice.DRAWER.name() +"\tenter your choice");
			cases = sc.nextInt();
		switch(cases)
		{
		case 1 : registerstudent.start();
		break;
		case 2 : activity.start();
		break;
		default :
		break;

		}
		}
		else
		{
			System.out.println("enter your mobilenumber");	
			mob = sc.nextLine();
			details.setStdMobileNumber(mob);
			System.out.println(details.getStudentmobilenumber());
		}
		sc.close();

	}

}
