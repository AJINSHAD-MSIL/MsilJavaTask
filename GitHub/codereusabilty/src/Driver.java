
public class Driver {	
	String name,sex,age;
	
	public void setDriverDetails(String name,String sex,String age)
	{
		this.name = name;
		this.age = age;
		this.sex  = sex;
	}
	
	public String getDriver()
	{
		return "current driver of this car is "+name+","+" his age is "+ age+" and gender is "+ sex ;
		
	}
}
 