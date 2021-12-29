
public class Customer {
	Salesman salesman;
	Customer(Salesman man)
	{
		this.salesman = man;
	}
	public void buyProduct()
	{
		System.out.println("i buy this product with a pleasure"+salesman.returnProductdet());
	}

}
