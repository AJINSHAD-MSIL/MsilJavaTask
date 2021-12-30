import java.util.Scanner;

public class CarModification{

	Car car;
	Engine engine;
	public CarModification (Car car)
	{
		this.car = car;
	}
	public CarModification (Engine engine)
	{
		this.engine = engine;
	}
	
	public void changeEngine()
	{
		System.out.println("select the engine type");
		System.out.println("1.2strock\n2.4strock");
		Scanner sc = new Scanner(System.in);
		String engin = sc.nextLine();
		System.out.println("Select fuel type");
		System.out.println("1.Petrol\n2.Diesel");
		String type = sc.nextLine();
		engine.setFuelType(type);
		if(engin.equals("2"))
		{
			changetofourstrock(engine);
		}
		else
		{
			changetotwostrock(engine);
		}
		
		sc.close();
	}
	
	
	public void changetofourstrock(Engine engine)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide engine name");
		String engname = sc.nextLine();
		String name = engine.engineNames().contains(engname) ? engname:"";
		System.out.println("the"+engine.fourstrock()+" is successfully created for "+name+"and its fuel type is "+engine.getfuelType());
		sc.close();
		return;
	}
	public void changetotwostrock(Engine engine)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide engine name");
		String engname = sc.nextLine();
		String name = engine.engineNames().contains(engname) ? engname:"";
		System.out.println("the"+engine.twoStrock()+" is successfully created for "+name+"  and its fuel type is "+engine.getfuelType());
		sc.close();	
		return;
		}
	
	public String changeBody()
	{
		System.out.println("which part of the car need to change ???");
		Scanner sc = new Scanner(System.in);
		if(!sc.hasNext())
		{
		sc.close();
		}
		return sc.nextLine();
	}
	}
