package BTVN.Bai_1;

import java.util.Scanner;

public class Animal {
	Scanner input = new Scanner(System.in);
	private String name;
	private Byte age;
	private float weight;

	
	public Animal() {
	}
	public Animal(String name, Byte age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void Input()
	{
		System.out.print("Name: ");
		this.name = input.nextLine();
		System.out.print("Age: ");
		this.age = input.nextByte();
		System.out.print("Weight: ");
		this.weight = input.nextFloat();
	}

	public void Output()
	{
		System.out.printf("%-20s %-10d %.2-10f", name, age, weight);
	}

	public void tiengKeu()
	{
	}
	
}
