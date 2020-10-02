import java.util.Arrays;
public class stringSort
{
	public static void main(String args[])
	{
		String fruits[] = {"Mango","Banana","Grapes","Apple","Lichi"};
		
		System.out.println("String Before Sort");
		for(String i:fruits)
			System.out.println(i);

		Arrays.sort(fruits);
		System.out.println("String After Sort");
		for(String i:fruits)
			System.out.println(i);
	}

}