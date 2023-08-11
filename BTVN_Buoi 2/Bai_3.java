
import java.util.Scanner;

public class Bai_3 {
	boolean check(int n){
		if(n == 1)
			return false;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		Bai_3 obj = new Bai_3();
		Scanner input = new Scanner(System.in);
		int n;
		do{
			System.out.print("Nhap n: ");
			n = input.nextInt();
		}while(n < 0);
		if(obj.check(n)){
			System.out.println(n + " la so nguyen to!");
		}else{
			System.out.println(n + " khong phai la so nguyen to!");
		}
		input.close();

	}
}
