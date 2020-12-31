import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("계절을 찾겠습니다.");
		do {		
			System.out.print("몇 월 입니까? ");
			int month = scan.nextInt();
			if (month>0 && month<13) {
				switch (month) {
					case 1: 
					case 2:
					case 12:
						System.out.println("겨울입니다.");
						break;
					case 3: 
					case 4:
					case 5:
						System.out.println("봄입니다.");
						break;
					case 6: 
					case 7:
					case 8:
						System.out.println("여름입니다.");
						break;
					case 9: 
					case 10:
					case 11:
						System.out.println("가을입니다.");
						break;
					
				} 
				System.out.print("계속하시겠습니까? 1-Yes / 0-No ");
				int con = scan.nextInt();
				if (con==1) {
					continue;
				} else if (con==0) {
					break;
				}
			}	else {
				continue;
			}
			
		}while(true);

		
	}
}
