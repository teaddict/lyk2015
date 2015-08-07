
abstract public class Car {
	private int price;
	
	public int getPrice()
	{
			return price;
	}
	
	public abstract int tax();
}

class Bmw extends Car
{
	private int price = 30000;
	
	public int tax()
	{
		return (price * 30)/100; 
	}
}

class Audi extends Car
{
	private int price = 20000;
	
	public int tax()
	{
		return (price * 40)/100; 
	}
}

class Main
{
	public static void main(String[] args) {
		
		Car bmw = new Bmw();
		Car audi = new Audi();
		
		System.out.println("BMW TAX: ");
		System.out.println(bmw.tax());
		System.out.println("AUDI TAX: ");
		System.out.println(audi.tax());
	}
}
