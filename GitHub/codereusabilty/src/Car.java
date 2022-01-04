import java.util.Random;
import java.util.Scanner;

public class Car extends setCarFunction  implements Vehicleproperties,HighRangeCarCommonFeatures,LowRangeCarCommonFeature
{
	Driver driver;
	CarModify modification;
	Scanner sc = new Scanner(System.in);
	
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
	public void dispalyDefaultTyres()
	{
		super.dispalyDefaultTyres();
	}
	

	@Override
	public void withGear() {
		
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
	public void normalStearing() {
		System.out.println("Rotate the steering wheel ");
	}
	@Override
	public void body() {
		
		System.out.println("Your car body is changed as per your requirements!"+modification.changeBody());
	}


	@Override
	public void lowMilage() {
		System.out.println("Milage is 40km per hour");

	}

	@Override
	public void powerStearing() {
		
		System.out.println("it have power stearing");

	}

	@Override
	public void withoutGear() {
		Random rand = new Random();
		int n = rand. nextInt(4);
		if(n != 0)
		{
		System.out.println("Now gear is changed to\t"+n);
		}
	}

	@Override
	public void highMilage() {
		System.out.println("Milage is 100km per hour");

	}	
}
