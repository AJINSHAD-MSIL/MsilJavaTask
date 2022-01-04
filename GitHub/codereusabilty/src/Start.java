import java.util.Scanner;

public class Start {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[]args)
	{
		
		Engine engine = new Engine();
		Driver driver = new Driver();
		CarModify modification = new CarModify(engine);
		LowRateCar lowrate = new LowRateCar(modification);
		HighRateCar highrate = new HighRateCar(modification);
		CarSterio music = new CarSterio();
		printDetails("\t\t\t\t\t\t----------------::::::::::::start game:::::::::::-------------\n","");
		printDetails("\n","");
		while(true)
		{
			
		printDetails("1.lowrate car\n2.highrate car\n3.exit","\nplease select anyone");
		String var;
		if(scan.hasNextLine())
		{
		var = scan.nextLine();
		switch(var)
		{
		case "1" :
		case "2" :commonCarFunctionalities(modification,driver,engine,lowrate,var,highrate,music);
		break;
		case "3": printDetails("please try agin !!!!","");
		break;
		}
		}
		}
	}
	
	private static void commonCarFunctionalities(CarModify modification,Driver driver,Engine engine,LowRateCar lowRateCar,String itrate,HighRateCar highRateCar,CarSterio music)
	{
		printDetails("Please enter driver name,gender,age","");
		String name,gender,age;
		name = scan.nextLine();
		gender = scan.nextLine();
		age = scan.nextLine();
		switch(itrate)
		{
		
		case "1":	
			if(name != "" && gender != "" && age != "")
		{
			driver.setDriverDetails(name,gender,age);
			printDetails(driver.getDriver(),"");
			lowRangecar(lowRateCar,music);
		}
		else
		{
			printDetails("Please provide proper details of the driver!","");
		}
		break;
		case "2":
			if(name != "" && gender != "" && age != "")
			{
				driver.setDriverDetails(name,gender,age);
				printDetails(driver.getDriver(),"");
				highRangeCar(highRateCar);

			}

		
		}
	}
		
	
	private static void lowRangecar(LowRateCar car,CarSterio music)
	{
		String amount,nextval;
		printDetails("Please pay Rs.2L to avail the car","");
		amount = scan.nextLine();
		if(amount.equalsIgnoreCase("2L"))
		{
			
		while(true)
			{
			printDetails("select any options","1.start\n2.break\n3.gear\n4.clutch\n5.stearing\n6.exit\n7.ModifyCarSettings");
			String val = scan.nextLine();
			if(val.equals("7"))
				
			{
				while(true)
				{
					
				printDetails("1.addSterio\n2.change Engine\n3.changeBody\n4.tyres\n5.exit","");
				if(scan.hasNextLine())
				{
				
				nextval = scan.nextLine();
				if(nextval.equalsIgnoreCase("1"))
				{
					printDetails("Need to set Sterio then Press Y or y","");
					amount = scan.nextLine();
					if(amount.equalsIgnoreCase("y"))
					{
						String type = car.sterioAssembling(music);
						if(!type.equalsIgnoreCase(""))
						{
							printDetails(type,"");
							playmusic(music);
						}

					}
					else
					{
						printDetails("try again","");
					}

				}
				else if(nextval.equalsIgnoreCase("2"))
				{
					car.modification.changeEngine(car);
				}
				else if(nextval.equalsIgnoreCase("3"))
				{
					String bodychange = car.modification.changeBody();
					printDetails(bodychange,"");
				}
				else
				{
					if(nextval.equals("5"))
					{
						break;
					}
				}
				}
				else
				{
					printDetails("please try agin !!!","");
				}
			}
			}
			else if(val.equals("1")||val.equals("2") || val.equals("3") || val.equals("4") || val.equals("5") || val.equals("6"))
			{
				carOperation(val,car);
			}
			}
			}
			else
			{
				printDetails("please try again","");
			}
		
	}
	

	
	
	
	private static void highRangeCar(HighRateCar car)
	{
		String amount,nextval;
		printDetails("Please pay Rs.10L to avail the car","");
		amount = scan.nextLine();
		if(amount.equalsIgnoreCase("10L"))
		{
		while(true)
			{
			
			printDetails("select any options","1.Start\n2.ModifyCarSettings\n3.break\n4.clutch\n7.playMusic\n6.exit");
			String val = scan.nextLine();
			if(val.equals("2"))
				
			{
				while(true)
				{
					
				printDetails("1.change Engine\n2.changeBody\n3.exit","");
				nextval = scan.nextLine();
				if(nextval.equalsIgnoreCase("1"))
				{
						car.modification.changeEngine(car);
				}
				else if(nextval.equalsIgnoreCase("2"))
				{
					String bodychange = car.modification.changeBody();
					printDetails(bodychange,"");
				}
				else
				{
					if(nextval.equalsIgnoreCase("3"))
					{
							break;
					}
				}

			}
		}
			else if(val.equalsIgnoreCase("1")||val.equalsIgnoreCase("2") || val.equalsIgnoreCase("3") || val.equalsIgnoreCase("4")  || val.equalsIgnoreCase("6"))
			{
				carOperation(val,car);
			}
			else
			{
				if(val.equalsIgnoreCase("7"))
					{
						CarSterio music = new CarSterio();
						playmusic(music);
					}
			break;
			}
			}
		}
			else
			{
				printDetails("please try again","");
			}	
		
}

	private static void carOperation(String val,Car car)
	{
		switch(val)
		{
		case "1":printDetails("Car is Started Now","");
		if(car instanceof  HighRateCar)
		{
			car.powerStearing();
			car.withoutGear();
			car.highMilage();
		}
		else
		{
		car.lowMilage();
		}

		break;
		case "2": car.carBreak();
		break;
		case "3":car.withGear();
		break;
		case "4":car.clutch();
		break;
		case "5":car.normalStearing();
		break;
		case "6":printDetails("Thank you for using this car","");
		System.exit(0);
		break;
		}
	}
	
	
	
	private static void printDetails(String options,String details)
	{
		System.out.println(options);
		System.out.println(details);
		
	}
	private static void playmusic(CarSterio music)
	{
		String song = "";
		while(true)
		{
			printDetails("1.play\n2.pause\n3.stop\n4.exit","select any option");
			switch(scan.nextLine())
			{
			case "1":printDetails("please Enter the song","");
			song = music.playMusic(scan.nextLine());
			printDetails(song,"");
			break;
			case "2":if(song.equalsIgnoreCase(""))
			{
				printDetails("please choose proper option","");

			}
			else
			{
				printDetails(music.pauseMusic(song),"");
			}
			break;
			case "3":printDetails(music.stopMusic(),"");
			break;
			case "4":return;
			}
		}
	}
	
}

