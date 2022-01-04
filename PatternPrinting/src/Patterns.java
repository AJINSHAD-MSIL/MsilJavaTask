import java.util.Scanner;

public class Patterns {
	public static Scanner sc  = new Scanner(System.in);
	public static void main(String []args)
	{
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("1.sqaure\n2.rectangle\n3.triangle\n4.Homepattern\n\nSelect any one");
		String input = sc.nextLine();

		switch(input)
		{
		case "1":printSqaurePattern(name);
		break;
		case "2":printRectanglePattern(name);
		break;
		case "3":printTraianglePattern(name);
		break;
		case "4":printHomePattern();
		break;
		default:break;
		}
		sc.close();

	}
	public static void printSqaurePattern(String name)
	{
				
		char[]namearr = name.toCharArray();
		for(int i = 0;i < name.length();i++)
		{
			for(int j = i; j < name.length();j++)
			{
				System.out.print(" "+namearr[j]);
			}
			if(i!=0) {
				for(int j=0; j<i;j++) {
					System.out.print(" "+namearr[j]);
				}
			}
			System.out.print("\n");

		}

	}

	public static void printRectanglePattern(String name)
	{
		char[]namearr = name.toCharArray();		
		for(int i = 0;i <= namearr.length - 1;i++)
		{
			for(int j = 0; j <= namearr.length-1;j++)
			{
				System.out.print(" ");
			}
			for(int k = 0;k <= namearr.length - 1;k ++)
			{
				if(k == 0 || k == namearr.length - 1 || i == 0 || i == namearr.length - 1)
				{
					System.out.print(" "+namearr[i]);

				}
				else
				{
					System.out.print("  ");

				}
			}
			System.out.print("\n");

		}
	}
	static void printTraianglePattern(String name)
	{		
		char[]namearray = name.toCharArray();
		while(true)
		{
		System.out.println("1.noninverting\n2.inverting");
		int input = sc.nextInt();
		switch(input)
		{
		case 1:
	        for (int i = 0; i <= namearray.length - 1; i++) {
	        	for(int j = i;j <= namearray.length - 1;j++)
				{
					System.out.print(" ");
				}
	            for (int k = namearray.length - 1 ; k >=(namearray.length-1-i) ; k--) {
	               System.out.print(" "+namearray[k]+" ");
	            }

                System.out.print("\n");

	        }
		break;
		case 2 :
			for(int i = 0;i <= namearray.length ;i++)
			{
				for(int j = 1;j <= namearray.length ;j++)
				{
					System.out.print(" ");
				}
				for(int j = 0;j <= i;j++)
				{
					System.out.print(" ");
				}
				for(int k = i;k <=namearray.length-1;k++)
				{
					System.out.print(namearray[k]+" ");
				}
				
				System.out.print("\n");

			}
			break;
		default:break;
		}
		}
		
	}
	static void printHomePattern()
	{
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
        for (int i=0; i<rows; i++)
        {
        	 for (int j=rows-i; j>1; j--)
             {
        	     System.out.print(" ");
             }
 
        	for(int j = i;j <= rows*2 - 1;j++)
    			{
    				System.out.print(" ");
    
    			}
           
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
           
            System.out.println();
        }

		for(int i = 0;i <=rows - 1;i++)
		{
			for(int j = 0;j <= 1;j++)
			{
				System.out.print(" ");

			}

			for(int j = 0;j <= rows;j++)
			{
				System.out.print(" ");

			}
			for(int k = 0;k <rows*2-2;k++)
			{
				if(((k == 2 || k == 5) && (i == 2 || i== 3)))
				{
					System.out.print("  ");

				}
			else
				{
				System.out.print("* ");
				}

			}
			System.out.print("\n");

		}
	      
	    for(int i = 0;i <= rows-3;i++)
	    {
	    	for(int j = 0;j <= rows - 3;j++)
	    	{
	            System.out.print(" ");

	    	}
	    	for(int k = 0;k <= 3*rows-3;k++)
	    	{
	            System.out.print("* ");

	    	}
            System.out.print("\n");

	    }
	    for(int i = 0;i <= 3*rows-5;i++)
	    {
	    	for(int j = i;j <= 3*rows - 3;j++)
	    	{
	            System.out.print(" ");

	    	}
	    	for(int k = 0;k <= rows-3;k++)
	    	{
	            System.out.print("* ");

	    	}
            System.out.print("\n");

	    }	    
		}	
}


	

