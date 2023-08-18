import java.util.Scanner;

class Rectangle{
	Scanner input = new Scanner(System.in);
	private float length;
	private float width;
	Rectangle(){}
	Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	public void setLength(float a){
		length = a;
	}
	public void setWidth(float a){
		width = a;
	}
	public float getLength(){
		return length;
	}
	public float getWidth(){
		return width;
	}
	public void Nhap(){
		System.out.println("Nhap chieu dai: ");
		length = input.nextFloat();
		System.out.println("Nhap chieu rong: ");
		width = input.nextFloat();
	}
	public void DrawRectangle(){
		for(int i = 0; i < width; i++){
			for(int j = 0; j < length; j++){
				if(i == 0 || j == 0 || i == width-1 || j == length-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	public float Area(){
		return width*length;
	}
	public float Perimeter(){
		return 2*(width+length);
	}
}

class Bai_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle a = new Rectangle();
		float length = input.nextFloat();
		float width = input.nextFloat();
		a.setLength(length);
		a.setWidth(width);
		System.out.println("Area of rectangle = " + a.Area());
		System.out.println("Perimeter of rectangle = " + a.Perimeter());
		a.DrawRectangle();
		input.close();
	}
}
