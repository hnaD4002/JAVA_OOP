package Bai_2;


public class Student extends Person {
	private int id;
	private Address address;
	private double gpa;
	public Student(int id, Address address, double gpa) {
		this.id = id;
		this.address = address;
		this.gpa = gpa;
	}

	public Student(String name, int age, String gender, int id, Address address, double gpa) {
		super(name, age, gender);
		this.id = id;
		this.address = address;
		this.gpa = gpa;
	}
	public Student(){

	}

	public int getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public double getGpa() {
		return gpa;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void Nhap()
	{
		System.out.print("ID: ");
		id = input.nextInt();
		input.nextLine();
		super.Nhap();
		address = new Address();
		address.Nhap();
		System.out.print("GPA: ");
		gpa = input.nextDouble();

	}

	public void Xuat() {
		System.out.printf("%-20d", id);
		super.Xuat();
		address.Xuat();
		System.out.printf("%-20f\n", gpa);
	}

}
