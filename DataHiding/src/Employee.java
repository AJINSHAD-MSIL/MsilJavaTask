
public class Employee {

	private int empno,empidcardno;
	private String empname;
	
	
	public void setEmpidCardNumber(int idno)
	{
		this.empidcardno = idno;
	}
	public void setEmpNo(int empno)
	{
		this.empno = empno;
	}
	public void setEmpName(String name)
	{
		this.empname = name;
	}

	public int getEmpNumber()
	{
		return empno;
	}
	public int getEmpIdCardNo()
	{
		return empidcardno;
	}

	public String getEmpName()
	{
		return empname;
	}
	
}
