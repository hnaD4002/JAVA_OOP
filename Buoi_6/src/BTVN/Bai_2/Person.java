package BTVN.Bai_2;

import java.util.Scanner;

public class Person {
	Scanner input = new Scanner(System.in);
	private String name, address;
	private Date birthDay;
	private Byte age;

	public Person() {
		birthDay = new Date();
	}

	public Person(String name, String address, Date birthDay, Byte age) {
		this.name = name;
		this.address = address;
		this.birthDay = birthDay;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}

	public void Nhap()
	{
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("Age: ");
		age = input.nextByte();
		input.nextLine();
		System.out.print("Address: ");
		address = input.nextLine();
		birthDay.Nhap();
	}

	public void Xuat()
	{
		System.out.printf("%-20s %-20d %-20s ", name, age, address);
		birthDay.Xuat();
	}
	
}
