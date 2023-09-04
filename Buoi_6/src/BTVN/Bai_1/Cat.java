package BTVN.Bai_1;

public class Cat extends Animal{
	private String color, preferences, ownerName;

	public Cat()
	{
	}
	public Cat(String color, String preferences, String ownerName) {
		this.color = color;
		this.preferences = preferences;
		this.ownerName = ownerName;
	}

	public Cat(String name, Byte age, float weight, String color, String preferences, String ownerName) {
		super(name, age, weight);
		this.color = color;
		this.preferences = preferences;
		this.ownerName = ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void Input()
	{
		super.Input();
		input.nextLine();
		System.out.print("Color: ");
		color = input.nextLine();
		System.out.print("Preferences: ");
		preferences = input.nextLine();
		System.out.print("Owner Name: ");
		ownerName = input.nextLine();
	}

	public void Output()
	{
		super.Output();
		System.out.printf("%-10s %-10s %-10s\n", color, preferences, ownerName);
	}
	@Override
	public void tiengKeu()
	{
		System.out.println("Mèo méo meo mèo meo!");
	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.Input();
		cat.Output();
		cat.tiengKeu();
	}
}
