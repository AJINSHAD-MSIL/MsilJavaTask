
public class HighRateCar extends Car{
	
	CarModify modification;
	public HighRateCar(CarModify modify)
	{
		this.modification = modify;
	}
	
	@Override
	public int changeTyre() {
		return super.changeTyre();
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
	public void powerStearing() {
		super.powerStearing();
	}
}
