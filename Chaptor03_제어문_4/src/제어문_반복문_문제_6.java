// 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
import java.util.Scanner;
public class 제어문_반복문_문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int	num = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.print("1 ~ 10까지의 합 : " + sum);
		System.exit(0);
	}
}
