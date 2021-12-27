package Student;

public class StoreDetails {
	
	private String student_name, stdent_mobile_Number, parent_mobile_Number,student_email,parent_email;

	public void setStudentName(String name)
	{
		this.student_name = name;
	}
	
	public void setStdMobileNumber(String stdmobile)
	{
		this.stdent_mobile_Number = stdmobile;
	}
	public void setParentMobileNumber(String parentnumber)
	{
		this.parent_mobile_Number = parentnumber;
	}
	public void setStudentEmail(String stdemail)
	{
		this.student_email =stdemail;
	}
	public void setParentEmail(String parentemail)
	{
		this.parent_email = parentemail;
	}
	
	
	public String getStudentName()
	{
		return student_name;
	}
	
	public String getStudentmobilenumber()
	{
		return stdent_mobile_Number;
	}
	
	public String getStudentEmail()
	{
		return student_email;
	}
	public String getParentMobile()
	{
	return parent_mobile_Number;	
	}public String getParentEmail()
	{
		return parent_email;
	}
}
