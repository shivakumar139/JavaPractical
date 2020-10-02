public class arrayObj
{
	public static void main(String args[])
	{
		Student arr[] = new Student[2];
		
		arr[0] = new Student(101,"Shiva");
		arr[1] = new Student(102,"Ramesh");
		
		arr[0].display();
		arr[1].display();
		
	}
}

class Student
{
	private int id;
	private String name;
	
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		System.out.println("id: "+id+" Name: "+name);
	}
}