class Car
{
	String companyName;
	String color;
	int price;
	int fuleCapacity;
	public Car(String CompanyName, String Color, int price, int fuelCapacity)
	{
		this.CompanyName = CompanyName;
		this.Color = Color;
		this.price = price;
		this.fuelCapacity = fuelCapacity;
	}
	public void displayCarInfo()
	{
		System.out.println("Company Name: "+companyName);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Fuel Capacity: "+fuelCapacity);
	}
}

public class Main
{
	Car audi = new Car("audi","red",35000,35);
	audi.displayCarInfo();
}