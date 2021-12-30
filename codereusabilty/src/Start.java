import java.util.Scanner;

public class Start {
	
	public static void main(String[]args)
	{
		Car car;
		Engine engine = new Engine();
		Driver driver = new Driver();
		CarModification modification;
		System.out.print("\t\t\t\t\t\t----------------::::::::::::start:::::::-------------\n");
		System.out.print("\n\n\n");
		Scanner scan = new Scanner(System.in);
		while(true)
		{
		System.out.print("1.car\n2.modify car");
		System.out.println("\nplease select anyone");
		String var;
		if(scan.hasNextLine())
		{
		var = scan.nextLine();
		}
		else
		{
			break;
		}
		switch(var)
		{
		
		case "1":System.out.println("Please enter your name,age,sex");
				driver.name = scan.nextLine();
				driver.age = Integer.valueOf(scan.nextLine());
				driver.sex = scan.nextLine();
				car = new Car(driver);
				car.driver();
				while(true)
				{
				System.out.println("select any options");
				System.out.println("1.music\n2.break\n3.gear\n4.clutch\n5.stearing\n6.exit");
				String val = scan.nextLine();
				if(val.equals("1"))
				{
					String music = car.musicsystem();
					System.out.println(music);
				}
				else if(val.equals("2"))
				{
					car.breaks();
				}
				else if(val.equals("3"))
				{
					car.gear();
				}
				else if(val.equals("4"))
				{
					car.clutch();
				}
				else if(val.equals("5"))
				{
					car.stearing();
				}
				else
				{
					if(val.equals("6"))
					{
					System.out.println("Thank you for using this car");
					}
					break;
				}
				}
				break;
				
		case "2":modification = new CarModification(engine);
		while(true)
		{
		System.out.println("select any options");
		System.out.println("1.change body\n2.engine\n3.fueltype");
		String val;
		if(scan.hasNextLine())
		{
		val = scan.nextLine();
		}
		else
		{
			val = "";
		}

		if(val.equals("1"))
		{
			String body = modification.changeBody();
			System.out.println(body+" will be modified");

		}
		else if(val.equals("2"))
		{
			modification.changeEngine();
		}
		else if(val.equals("3"))
			{
				System.out.println("enter the fuel");

				if(scan.nextLine().equals("1"))
				{
				engine.setFuelType("petrol");
				System.out.println(engine.getfuelType()+" is used as the fuel");
				}
				else
				{
					engine.setFuelType("deisel");
					System.out.println(engine.getfuelType()+" is used as the fuel");
				}
			}
		else
		{
			System.out.println("Thank you for using Services");

			break;
		}
		}
		
		break;
		default:
			break;

		}
	}
	}

}

