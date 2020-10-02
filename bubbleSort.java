public class bubbleSort
{
	public static void main(String []args)
	{
		int arr[] = {25,36,878,12,44,36,78};
		int temp;
		System.out.println("Array Before Sort");
		for(int i:arr)
			System.out.print(i+"\t");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\nArray After Bubble Sort");
		for(int i:arr)
			System.out.print(i+"\t");
	}
}