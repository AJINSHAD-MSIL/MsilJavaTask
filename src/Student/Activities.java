package Student;

import java.util.Scanner;

public class Activities extends MainDrawer implements Acts{
	
	@Override
	public void message()
	{
		super.message();
	}
	
	int choice,rad;
	float length,width;
	void draw(int radious)
	{
		float pie = (float) 3.14;
		float area = pie * radious * radious ;
		System.out.println("circleArea is"+area);
	}

	void draw(int base,int hieght)
	{
		float area = base * hieght / 2 ;
		System.out.println("triangle is"+area);

	}
	void draw(float length,float width)
	{
		float area = length * width ;
		System.out.println("rectangle is"+area);

	}

	@Override
	public void complete() {
		System.out.println("Successfully completed");
		
	}

	@Override
	public void start() {
		message();
		System.out.println("1.draw circle,2.drawtriangle  Enetr your choice");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice)
		{
		case 1 :rad = sc.nextInt();
		draw(rad);
		break;
		case 2:length = sc.nextFloat();
		width = sc.nextFloat();
		draw(length,width);
		break;
		case 3:length = sc.nextFloat();
		width = sc.nextFloat();
		draw(length,width);
		break;
		default:
		break;
		}
		
		sc.close();
	}

}
