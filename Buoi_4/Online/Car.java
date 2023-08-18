/* OOP 
 * 
 * 
 */
package Online;
// Car
class Car {

	// Attribute of class Car
	private String name, hangSanXuat;
	private int namSanXuat;

	// Method of class Car

	public Car() {
	}

	public void setName(String name1) {
		name = name1;
	}

	public String getName() {
		return name;
	}

	public void setYear(int year) {
		namSanXuat = year;
	}

	public int getYear() {
		return namSanXuat;
	}

	public void setHang(String hang) {
		hangSanXuat = hang;
	}

	public String getHang() {
		return hangSanXuat;
	}

	public void Move() {
		System.out.println("Move");
	}

	public void Stop() {
		System.out.println("Stop");
	}

	public void Print() {
		System.out.println("Name: " + name);
		System.out.println("Nam san xuat: " + namSanXuat);
		System.out.println("Hang san xuat: " + hangSanXuat);
	}

}
// Circle
class Circle {
	private double radius;

	Circle(double r) {
		radius = r;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getCircumferenxe() {
		return Math.PI * radius * 2;
	}
}
// Student
class Student {

	private int id, age, score;
	private String name, address;

	Student() {
	}

	Student(int id1, String name1, int age1, String address1, int score1) {
		id = id1;
		name = name1;
		age = age1;
		address = address1;
		score = score1;
	}

	public void setId(int id1) {
		id = id1;
	}

	public int getId() {
		return id;
	}

	public void setName(String name1) {
		name = name1;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age1) {
		age = age1;
	}

	public int getAge() {
		return age;
	}

	public void setAddress(String add) {
		address = add;
	}

	public String getAddress() {
		return address;
	}

	public void setScore(int id1) {
		score = id1;
	}

	public int getScore() {
		return score;
	}
	public void Print(){
		System.out.printf("ID: %d\t Name: %s\tAge: %d\tAddress: %s\tScore: %d\n", id, name, age, address, score);
	}
}
// Point 
class Point {
	private double x, y;
	public Point() {
	}

	public Point(double a, double b) {
		x = a;
		y = b;
	}

	public void setX(double a) {
		x = a;
	}

	public double getX() {
		return x;
	}

	public void setY(double a) {
		y = a;
	}

	public double getY() {
		return y;
	}

	public void setXY(double a, double b) {
		x = a;
		y = b;
	}

	public double distance(double _x, double _y) {

		return Math.sqrt(_y * _y + _x * _x);
	}

	public double distance(Point b) {
		return Math.sqrt(Math.pow((x - b.getX()), 2) + Math.pow((y - b.getY()), 2));
	}

	@Override
	public String toString() {
		return "Point []";
	}

}