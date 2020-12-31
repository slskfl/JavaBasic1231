import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("몇 cm부터 : ");
		int num1 = scan.nextInt();
		System.out.print("몇 cm까지 : ");
		int num2 = scan.nextInt();
		System.out.print("몇 cm단위 : ");
		int num3 = scan.nextInt();
		System.out.println("신장 표준체중");
		System.out.println("-------------");
		
		
		for (int i=num1; i<=num2; i+=num3) {
			int weight = (int)((i-100) * 0.9);
			System.out.println(i + " " + weight);
		}
			
	}
}
