package BTVN;

import java.util.Scanner;

public class Bai_2 {
	int GiaiThua(int n){
		if(n == 0)
			return 1;
		return n * GiaiThua(n-1);
	}
	void Cau_a(int n){
		double sum = 0;
		for(int i = 1; i <= n; i++){
			sum += 1/(1.0 * i);
		}
		System.out.println(sum);
	}
	void Cau_b(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += GiaiThua(i);
		}
		System.out.println(sum);
	}
	public static void main(String[] args){
		Bai_2 obj = new Bai_2();
		Scanner input = new Scanner(System.in);
		int n;
		do{
			System.out.print("Nhap n: ");
			n = input.nextInt();
		}while(n < 0);
		obj.Cau_a(n);
		obj.Cau_b(n);
		input.close();
	}
}
