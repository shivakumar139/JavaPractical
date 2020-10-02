class grade
{
	public static void main(String[] args)
	{
		int per=45;
		if(per>=95)
		{
			System.out.println("A Grade");
		}
		else if(per<=95 && per>=85)
		{
			System.out.println("B Grade");
		}
		else if(per<=85 && per>=75)
		{
			System.out.println("C Grade");
		}
		else if(per<=75 && per>=65)
		{
			System.out.println("D Grade");
		}
		else if(per<=65 && per>=55)
		{
			System.out.println("E Grade");
		}
		else
		{
			System.out.println("F Grade");
		}

	}
}