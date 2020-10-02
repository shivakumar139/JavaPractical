public class car
{
	String companyName;             
	String color;
	long price;
	int fuelCapacity;
	
	public car()
	{
		this.companyName = "not defined";
		this.color = "not defined";
		this.price = 0;
		this.fuelCapacity = 0;
	}
	public car(String companyName, String color, long price, int fuelCapacity)
	{
		this.companyName = companyName;
		this.color = color;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
	}
	public car(String companyName, long price)
	{
		this.companyName = companyName;
		this.color = "black";
		this.price = price;
		this.fuelCapacity = 45;
	}

	public void displayCarInfo()
	{
		System.out.println("Company Name: "+companyName);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Fuel Capacity: " + fuelCapacity);
	}
}