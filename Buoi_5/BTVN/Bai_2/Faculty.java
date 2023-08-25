package BTVN.Bai_2;

import java.util.Scanner;

class Faculty {
	Scanner input = new Scanner(System.in);
	private String name, date;
	private School x;

	public Faculty() {
	}

	public Faculty(String name, String date, School x) 
	{
		this.name = name;
		this.date = date;
		this.x = x;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}

	public void setSchool(School x)
	{
		this.x = x;
	}

	public School getSchool()
	{
		return this.x;
	}

	public void Input() {
		x = new School();
		System.out.print("Nhập tên trường: ");
		this.x.setName(input.nextLine());
		System.out.print("Nhập ngày thành lập trường: ");
		this.x.setDate(input.nextLine());
		System.out.print("Nhập tên khoa: ");
		this.name = input.nextLine();
		System.out.print("Nhập ngày thành lập khoa: ");
		this.date = input.nextLine();
	}

	public void Output()
	{
		System.out.printf("%-30s %-30s %-30s %-30s\n", this.x.getName(), this.x.getDate(), name, date);
	}
}
