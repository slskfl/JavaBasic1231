import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ã�ڽ��ϴ�.");
		do {		
			System.out.print("�� �� �Դϱ�? ");
			int month = scan.nextInt();
			if (month>0 && month<13) {
				switch (month) {
					case 1: 
					case 2:
					case 12:
						System.out.println("�ܿ��Դϴ�.");
						break;
					case 3: 
					case 4:
					case 5:
						System.out.println("���Դϴ�.");
						break;
					case 6: 
					case 7:
					case 8:
						System.out.println("�����Դϴ�.");
						break;
					case 9: 
					case 10:
					case 11:
						System.out.println("�����Դϴ�.");
						break;
					
				} 
				System.out.print("����Ͻðڽ��ϱ�? 1-Yes / 0-No ");
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
