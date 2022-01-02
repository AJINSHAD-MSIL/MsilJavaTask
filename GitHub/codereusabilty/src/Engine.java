import java.util.ArrayList;

public class Engine {
	
	ArrayList<String> list = new ArrayList<>();
	ArrayList<String> list2 = new ArrayList<>();
	ArrayList<String>names = new ArrayList<>();
	String fueltype;
	
	public ArrayList<String> fourstrock()
	{
		String piston,flywheel,sparkplug;
		piston = "piston is fitted";
		flywheel = "flywheel is fitted";
		sparkplug = "sparkplug is fitted";
		list.add(piston);
		list.add(flywheel);
		list.add(sparkplug);
		return list;
	}
	
	public ArrayList<String> twoStrock()
	{		
		String fuelinjector,cylinder,crank;
		fuelinjector = "fuelinjector is fitted";
		cylinder = "cylinder is fitted";
		crank = "crank is fitted";
		list2.add(fuelinjector);
		list2.add(cylinder);
		list2.add(crank);
		return list2;
	}
	public ArrayList<String> engineNames()
	{
		
		names.add("Alfa Romeo");
		names.add("Audi");
		names.add("Tesla");
		names.add("BMW");
		names.add("Suv");
		names.add("Citroen");
		names.add("Ford");
		return names;
	}
	public void setFuelType(String type)
	{
		this.fueltype = type;
	}
	public String getfuelType()
	{
		return fueltype;
	}


}
