class grade3
{
	public static void main(String args[])
	{
		int eng,hin,math;
		eng=68;
		hin=78;
		math=88;
		double grade =(eng+hin+math)/3;
		
		if(grade>=95 && grade<=100)
			System.out.println("A Grade");
		else if(grade>=85 && grade<=94)
			System.out.println("B Grade");
		else if(grade>=75 && grade<=84)
			System.out.println("C Grade");
		else if(grade>=65 && grade<=74)
			System.out.println("D Grade");
		else
			System.out.println("E Grade");
	}
}