import java.util.ArrayList;
import java.util.Scanner;

public class CarModify{
	Engine engine;
	Scanner sc = new Scanner(System.in);
	public CarModify (Engine engine)
	{
		this.engine = engine;
	}
	
	public void changeEngine()
	{
		System.out.println("select the engine type");
		System.out.println("1.2strock\n2.4strock");
		String engin = sc.nextLine();
		System.out.println("Select fuel type");
		System.out.println("1.Petrol\n2.Diesel");
		String type = sc.nextLine();
		if(type.equalsIgnoreCase("1"))
		{
			engine.setFuelType("Petrol");

		}
		else
		{
		engine.setFuelType("Petrol");
		}
		if(engin.equals("2"))
		{
			changeToFourStrock(engine);
		}
		else
		{
			changeToTwoStrock(engine);
		}
		
	}
	
	
	public void changeToFourStrock(Engine engine)
	{
		ArrayList<ArrayList<String>> engineNames = new ArrayList<>();
		engineNames.add(engine.engineNames());
		System.out.println(engineNames);
		System.out.println("please provide engine name");
		String engname = sc.nextLine();
		String name = engine.engineNames().contains(engname) ? engname:"";
		System.out.println("the"+engine.fourstrock()+" is successfully used for "+name+"and its fuel type is "+engine.getfuelType());
		return;
	}
	public void changeToTwoStrock(Engine engine)
	{	ArrayList<ArrayList<String>> engineNames = new ArrayList<>();
		engineNames.add(engine.engineNames());
		System.out.println(engineNames);
		System.out.println("please provide engine name");
		String engname = sc.nextLine();
		String name = engine.engineNames().contains(engname) ? engname:"";
		System.out.println("the"+engine.twoStrock()+" is successfully used for "+name+"  and its fuel type is "+engine.getfuelType());
		return;
		}
	
	public String changeBody()
	{
		System.out.println("wheels,tyre,door,top");
		System.out.println("please select the part which you want to change! ");
		if(!sc.hasNext())
		{
		sc.close();
		}
		return sc.nextLine() + " is changed now";
	}
	
	public String sterioFitting(String type)
	{
		
		if(type.equalsIgnoreCase("full range"))
		{
			type = type  + " is fitted";
		}
		else if(type.equalsIgnoreCase("mid bass"))
		{
			type = type + " is fitted";
		}
		else if(type.equalsIgnoreCase("subroofers"))
		{
			type = type + " is fitted";
		}
		else
		{
			type = "";
		}
		return type;
	}
	}
