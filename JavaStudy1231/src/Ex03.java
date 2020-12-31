import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요? : ");
		int num = scan.nextInt();

		if(num>0) {
			for(int i=0; i<num/5; i++) {
				System.out.println("*****");
			}
			int rest = num%5;
			if(rest>0) {
				for(int i=0; i<rest; i++) {
					System.out.print('*');
				}
				System.out.println();
			}
			
		}

	}
}
