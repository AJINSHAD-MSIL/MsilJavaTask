import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args)
	{
		Dynamicparam dynamic  = new Dynamicparam();
		System.out.println("eneter some inputs");
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter some Strings");
		String a,b,d;
		a = sc.nextLine();
		b = sc.nextLine();
		d = sc.nextLine();
//		List<String>list = new ArrayList<>();
//		for(int i = 0;i <= 4;i++)
//		{
//			list.add(sc.nextLine());
//		}

		System.out.println("eneter an integer");
		
		int x = Integer.valueOf(sc.nextLine());
		System.out.println("eneter a float value");
		float y = Float.valueOf(sc.nextLine());		
		dynamic.listOut(x, y,a,b,d);
		sc.close();
	}

}
