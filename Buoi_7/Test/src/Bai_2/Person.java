package Bai_2;

import java.util.Scanner;


public class Person {
	Scanner input = new Scanner(System.in);
	private String name;
	private int age;
	private String gender;
	
	public Person() {
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void Nhap()
	{
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("Age: ");
		age = input.nextInt();
		input.nextLine();
		System.out.print("Gender: ");
		gender = input.nextLine();
	}

	public void Xuat() {
		System.out.printf("%-20s%-20d%-20s", name, age, gender);
	}
	
	
}
