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
		System.out.print("\t\t\t\t\t\t----------------::::::::::::start:::::::::::-------------\n");
		System.out.print("\n\n\n");
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
		case "2" :carMainFuun(modification,driver,engine,lowrate,var,highrate);
		break;
		case "3": printDetails("please try agin !!!!","");
		break;
		}
		}
		}
	}
	
	private static void carMainFuun(CarModify modification,Driver driver,Engine engine,LowRateCar car,String var,HighRateCar car2)
	{
		System.out.println("Please enter driver name,sex,age");
		String name,sex,age;
		name = scan.nextLine();
		sex = scan.nextLine();
		age = scan.nextLine();
		switch(var)
		{
		
		case "1":	
			if(name != "" && sex != "" && age != "")
		{
			driver.setDriverDetails(name,sex,age);
			printDetails(driver.getDriver(),"");
			lowRangecar(car);
		}
		else
		{
			System.out.println("Please provide proper details of the driver!");
		}
		break;
		case "2":
			if(name != "" && sex != "" && age != "")
			{
				driver.setDriverDetails(name,sex,age);
				printDetails(driver.getDriver(),"");
				highRangeCar(car2);

			}

		
		}
	}
		
	
	private static void lowRangecar(LowRateCar car)
	{
		
		String amount,nextval;
		while(true)
			{
			printDetails("Please pay Rs.2L to avail the car","");
			amount = scan.nextLine();
			if(amount.equalsIgnoreCase("2L"))
			{
			printDetails("select any options","1.ModifyCarSettings\n2.break\n3.gear\n4.clutch\n5.stearing\n6.exit");
			String val = scan.nextLine();
			if(val.equals("1"))
				
			{
				while(true)
				{
					
				printDetails("1.addSterio\n2.change Engine\n3.changeBody\n4.exit","");
				if(scan.hasNextLine())
				{
				
				nextval = scan.nextLine();
				if(nextval.equalsIgnoreCase("1"))
				{
					printDetails("Please pay Rs.1000 for adding sterio","");
					amount = scan.nextLine();
					if(amount.equalsIgnoreCase("1000"))
					{
						CarSterio music = new CarSterio();
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
					car.modification.changeEngine();
				}
				else if(nextval.equalsIgnoreCase("3"))
				{
					String bodychange = car.modification.changeBody();
					printDetails(bodychange,"");
				}
				else
				{
					if(nextval.equals("4"))
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
			else if(val.equals("2"))
			{
				car.carBreak();
			}
			else if(val.equals("3"))
			{
				car.changeGear();
			}
			else if(val.equals("4"))
			{
				car.clutch();
			}
			else if(val.equals("5"))
			{
				car.stearingMotion();
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
			else
			{
				printDetails("please try again","");
			}
			}
		
}
	
	
	private static void highRangeCar(HighRateCar car)
	{
		String amount,nextval;
		while(true)
			{
			printDetails("Please pay Rs.10L to avail the car","");
			amount = scan.nextLine();
			if(amount.equalsIgnoreCase("10L"))
			{
			printDetails("select any options","1.ModifyCarSettings\n2.break\n3.gear\n4.clutch\n5.stearing\n6.playMusic\n7.exit");
			String val = scan.nextLine();
			if(val.equals("1"))
				
			{
				while(true)
				{
					
				printDetails("1.change Engine\n2.changeBody\n3.exit","");
				nextval = scan.nextLine();
				if(nextval.equalsIgnoreCase("1"))
				{
						car.modification.changeEngine();
				}
				else if(nextval.equalsIgnoreCase("2"))
				{
					String bodychange = car.modification.changeBody();
					printDetails(bodychange,"");
				}
				else
				{
					if(nextval.equals("3"))
					{
							break;
					}
				}

			}
		}
			else if(val.equals("2"))
			{
				car.carBreak();
			}
			else if(val.equals("3"))
			{
				car.changeGear();
			}
			else if(val.equals("4"))
			{
				car.clutch();
			}
			else if(val.equals("5"))
			{
				car.stearingMotion();
			}
			else if(val.equals("6"))
			{
				CarSterio music = new CarSterio();
				playmusic(music);
			}
			else
			{
			if(val.equals("7"))
			{
			printDetails("Thank you for using this car","");
			}
			break;
			}
			}
			else
			{
				printDetails("please try again","");
			}
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
			case "1":printDetails("please select the song","");
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

