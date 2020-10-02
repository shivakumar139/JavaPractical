class swap
{
	public static void main(String[] args)
	{
		int first,second,temp;
		first=5;
		second=10;
		
		System.out.println("--Before swap--");
       	 	System.out.println("First number = " + first);
        	System.out.println("Second number = " + second);

        	temp = first;
        	first = second;
        	second = temp;

        	System.out.println("--After swap--");
        	System.out.println("First number = " + first);
        	System.out.println("Second number = " + second);
		
	}
	
	
}