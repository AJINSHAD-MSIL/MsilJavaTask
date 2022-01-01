import java.util.Scanner;

public class Car extends setCarFunction  implements Vehicleproperties{
	
	Driver driver;
	CarModify modification;
	Scanner sc = new Scanner(System.in);
	@Override
	public String musicsystem() {
		System.out.println("give any song name");
		return sc.nextLine()+" is running now";
	}
	


	@Override
	public int changeTyre() {
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
	public void changeGear() {
		
		System.out.println("Please select the gear in which the car needs to move ");
		System.out.println("1.3\n2.4\n");

		if(sc.nextLine().equals("1"))
		{
			System.out.println("gear is changed to 3");

		}
		else if(sc.nextLine().equals("2"))
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
	public void carBreak() {
		
		System.out.println("break is applied");
		return;
	}

	@Override
	public void stearingMotion() {
		System.out.println("Rotate the steering wheel ");
	}
	@Override
	public void body() {
		
		System.out.println("Your car body is changed as per your requirements!"+modification.changeBody());
	}	
}
