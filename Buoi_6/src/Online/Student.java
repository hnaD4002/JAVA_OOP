package Online;

public class Student extends Person{
	private double gpa;

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Student(String name, int age, String address, double gpa) {
		super(name, age, address);
		this.gpa = gpa;
	}

	public Student(double gpa) {
		this.gpa = gpa;
	}

	public Student()
	{
	}

	public void display()
	{
		super.display();
		System.out.println("GPA: " + gpa);
	}

	
}
