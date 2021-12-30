import java.util.Scanner;

public class Car extends Vehicleproperty  implements Vehicleproperties{
	
	Driver driver;
	CarModification modification;
	Scanner sc = new Scanner(System.in);
	public Car(Driver driver)
	{
		this.driver = driver;
	}
	public Car(CarModification modify)
	{
		this.modification = modify;
	}
	
	@Override
	public void driver() {
		System.out.println("current driver of this car is "+driver.name+" and its age is "+driver.age+" gender is "+ driver.sex);
	}

	@Override
	public String musicsystem() {
		System.out.println("give any song name");
		return sc.nextLine()+" is running now";
	}


	@Override
	public int tyres() {
		System.out.println("enter the number of tyres 4 or 6");
		if(sc.nextLine().equals("4"))
		{
			return 4;
		}
		else
		{
			return 6;
		}
	}

	@Override
	public void gear() {
		
		System.out.println("which gear need to change");
		if(sc.nextLine().equals("3"))
		{
			System.out.println("gear is changed to 3");

		}
		else if(sc.nextLine().equals("4"))
		{
			System.out.println("gear is changed to 4");

		}
		else
		{
			System.out.println("current gear is 2");

		}
		
	}

	@Override
	public void clutch() {
		
		System.out.println("clutch is activated");

	}

	@Override
	public void breaks() {
		
		System.out.println("break is upplied");
		return;
	}

	@Override
	public void stearing() {
		System.out.println("stearing now running");
	}

	@Override
	public void body() {
		
		System.out.println("yes its changed now your car body is"+modification.changeBody());
	}
	@Override
	public void driving()
	{
		super.driving();
	}
	
}
