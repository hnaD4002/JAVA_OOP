import java.util.Scanner;

class Main{
// 48 57
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input: ");
		String a = input.nextLine();
		int sum = 0;
		for(int i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
				int j = i+1;
				int temp = a.charAt(i) - 48;
				if(j < a.length())
					while (a.charAt(j) >= '0' && a.charAt(j) <= '9') {
						temp *= 10;
						temp += a.charAt(j) - 48;
						j++;
						i++;
					}
				sum += temp;
			}
		}
		System.out.println("Output: " + sum);
		input.close();
	}

}