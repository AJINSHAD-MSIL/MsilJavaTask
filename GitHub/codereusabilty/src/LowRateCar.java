
public class LowRateCar extends Car{
	CarModify modification;
	
	public LowRateCar(CarModify modify) {
		this.modification = modify;
	}
	@Override
	public int changeTyre() {
		return super.changeTyre();
	}

	@Override
	public void changeGear() {
		super.changeGear();
	}

	@Override
	public void clutch() {
		super.clutch();
	}
	

	@Override
	public void carBreak() {
		super.carBreak();
	}

	@Override
	public void stearingMotion() {
		super.stearingMotion();
	}
	public String sterioAssembling(CarSterio music)
	{
		String type = null;
		System.out.println("1.full range\t\t:::::::: 10000Rs\n2.mid bass\t\t:::::::: 20000Rs\n3.subroofers\t\t:::::::::: 30000Rs");
		System.out.println("please select any one");
		if(sc.nextLine().equalsIgnoreCase("1"))
		{
			type = modification.sterioFitting("full range");
		}
		else if(sc.nextLine().equalsIgnoreCase("2"))
		{
			type = modification.sterioFitting("full range");

		}
		

		else if(sc.nextLine().equalsIgnoreCase("3"))
		{
			type = modification.sterioFitting("subroofers");
		}
		else
		{
			
		}
		return type;
	}

}
