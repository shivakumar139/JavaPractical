public class MainClass
{
	public static void main(String args[])
	{
		car audi = new car("audi","red",85000000,35);
		car ferrari = new car("ferrari",9000000);
		car swift = new car();

		audi.displayCarInfo();
		System.out.println("*************");
		ferrari.displayCarInfo();
		System.out.println("*************");
		swift.displayCarInfo();
	}
}