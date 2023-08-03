

import java.util.Scanner;

public class Bai_5 {
	int timMin(int a, int b, int c) {
		if (a <= b && a <= c)
			return a;
		if (b <= a && b <= c)
			return b;
		return c;
	}

	public static void main(String[] args) {
		Bai_5 obj = new Bai_5();
		Scanner input = new Scanner(System.in);
		System.out.print("Chanh: ");
		int a = input.nextInt();
		System.out.print("Tao: ");
		int b = input.nextInt();
		System.out.print("Le: ");
		int c = input.nextInt();
		int a_ = a / 1;
		int b_ = b / 2;
		int c_ = c / 4;
		int min = obj.timMin(a_, b_, c_);
		int sum = min * 1 + min * 2 + min * 4;
		System.out.printf("Tong so qua toi da: %d (Chanh: %d, Tao: %d, Le: %d)! ", sum, min * 1, min * 2, min * 4);
		input.close();
	}
}
