package BTVN.Bai_1;

public class Dog extends Animal
{
	private String character;

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public Dog(String character) {
		this.character = character;
	}

	public Dog(String name, Byte age, float weight, String character) {
		super(name, age, weight);
		this.character = character;
	}

	public Dog()
	{
	}

	public void Input() {
		super.Input();
		input.nextLine();
		System.out.print("Character: ");
		character = input.nextLine();
	}

	public void Output() {
		super.Output();
		System.out.printf("%-10s \n", character);
	}

	@Override
	public void tiengKeu() {
		System.out.println("Gâu gâu gâu gâu!");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.Input();
		dog.Output();
		dog.tiengKeu();
	}
	
	
	
}
