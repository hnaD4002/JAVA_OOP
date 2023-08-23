package Online;

public class Person
{
	// Thuoc tinh
	private static int id = 0;
	private String name;
	private int age;
	private double gpa;

	// Phuong thuc
	public Person(String name, int age, double gpa)
	{
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		++id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	public int getAge()
	{
		return this.age;
	}
	public void setGPA(double gpa)
	{
		this.gpa = gpa;
	}

	public double getGPA()
	{
		return this.gpa;
	}

	public void print() {
		System.out.println(this.name + "\n" + this.id);
	}
}
