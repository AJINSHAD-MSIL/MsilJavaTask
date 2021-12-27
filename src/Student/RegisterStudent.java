package Student;

import java.util.HashMap;
import java.util.Scanner;

class RegisterStudent extends StoreDetails implements Acts{
	
	 enum Takeyourchoice{
		REGISTERSTUDENT,DRAWER
	}
	 HashMap<String,String>std_details = new HashMap<>();
	@Override
	public void start()
	{
		String student_name,stdent_mobile_Number,parent_mobile_Number,student_email,parent_email;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Student name");
		student_name = sc.nextLine();
		setStdMobileNumber(student_name);
		System.out.println("Enetr student mobile number");
		stdent_mobile_Number = sc.nextLine();
		setParentMobileNumber(stdent_mobile_Number);
		System.out.println("Enetr parent mobile number");
		parent_mobile_Number = sc.nextLine();
		setStudentEmail(parent_mobile_Number);
		System.out.println("Enetr student email");
		student_email = sc.nextLine();
		setParentEmail(student_email);
		System.out.println("Enetr parent email");
		parent_email = sc.nextLine();
		setParentEmail(parent_email);
		complete();
		sc.close();
		
	}
	
	@Override
	public void complete() {
		std_details.put("student_name", getStudentName());
		std_details.put("stdent_mobile_Number", getStudentmobilenumber());
		std_details.put("parent_mobile_Number", getParentMobile());
		std_details.put("student_email", getStudentEmail());
		std_details.put("parent_email", getParentEmail());
		System.out.println("Student Details are:::::::::::::::::::\n"+std_details);
		System.out.println("Successfully completed");
	}
}
