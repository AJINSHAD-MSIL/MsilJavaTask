import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Employee employee = new Employee();
	static HashMap<String,String>empdetails = new HashMap<>();
	public static void main(String[] args) {		
		setempdetails();	
		getemployeeDetaiils();

	}
	static void setempdetails()
	{
		System.out.println("enter the emp details empname,empid,empno in order");
		Scanner sc = new Scanner(System.in);
		employee.setEmpName(sc.nextLine());
		employee.setEmpidCardNumber(Integer.valueOf(sc.nextLine()));
		employee.setEmpNo(Integer.valueOf(sc.nextLine()));
		sc.close();
	}
	static void getemployeeDetaiils()
	{
		empdetails.put("empid", String.valueOf(employee.getEmpNumber()));
		empdetails.put("empcardnumber", String.valueOf(employee.getEmpIdCardNo()));
		empdetails.put("EmpName", employee.getEmpName());
		System.out.println("\nEmployee details are::::"+empdetails);
	}

}
