 //package BTVN;

import java.util.Scanner;


public class Bai_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;
		System.out.print("Nhap a: ");
		a = input.nextDouble();
		System.out.print("Nhap b: ");
		b = input.nextDouble();
		System.out.print("Nhap c: ");
		c = input.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("Phuong trinh vo nghiem!");
		} else if (delta == 0) {
			double t = (-b / (2.0 * a));
			if(t < 0)
				System.out.println("Phuong trinh vo nghiem!");
			else{
				double x1 = Math.sqrt(t);
				double x2 = -1.0* Math.sqrt(t);
				if(x1 == x2){
					System.out.println("x1 = x2 = " + x1);
				}else{
					System.out.println("x1 = " + x1);
					System.out.println("x2 = " + x2);
				}
			}
		}else{
			double t1 = (-b - Math.sqrt(delta))/(2.0*a);
			double t2 = (-b + Math.sqrt(delta))/(2.0*a);
			double x1, x2, x3, x4;
			if(t1 < 0 || t2 < 0){
				if(t1 < 0)
					t1 = t2;
				x1 = Math.sqrt(t1);
				x2 = -1.0* Math.sqrt(t1);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}else if(t1 == 0 || t2 == 0){
				if(t1 == 0)
					t1 = t2;
				x1 = Math.sqrt(t1);
				x2 = -1.0* Math.sqrt(t1);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				System.out.println("x3 = 0");
			}else{
				x1 = Math.sqrt(t1);
				x2 = -1.0* Math.sqrt(t1);
				x3 = Math.sqrt(t2);
				x4 = -1.0* Math.sqrt(t2);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				System.out.println("x3 = " + x3);
				System.out.println("x4 = " + x4);
			}
		}
		input.close();
	}
}
