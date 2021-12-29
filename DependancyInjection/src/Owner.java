
public class Owner {
	public static void main(String[] args) {
		Salesman salesman = new Salesman();
		new Customer(salesman).buyProduct();
	}

}
