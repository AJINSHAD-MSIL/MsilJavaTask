import java.util.List;

public class Dynamicparam {
	

	public void listOut(int x,float y,String ...z)
	{
		System.out.println("x is"+x);
		System.out.println("y is"+y);
		for(String i : z)
		{
		System.out.println(""+i);
		}


	}
}
