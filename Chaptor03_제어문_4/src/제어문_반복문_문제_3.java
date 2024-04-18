// 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
/*
 * for => 반복문 => 반복 횟수가 있는 경우에 주로 사용
 * 	1) 형식과 순서
 * 			 	 (false일 경우 종료)
 * 				  ------
 * 			  1		 2	   4
 * 		for (초기값; 조건식; 증가식) {=> 정수 , 문자 
 * 			반복 실행 문장 
 * 				3	= (true 일 경우)	
 * 		}
 * 	2) 초기값		=> 	시작점 : 초기화와 동시에 선언이 가능. for(int i = 0; ...)문 하나만 사용하는 경우 위에서 따로 int i = 0;으로 선언 및 초기화를 할 필요가 없음.
 * 	3) 조건식		=>	어디까지 출력할지(범위) 설정.
 * 	4) 증가		=>	규칙을 결정. (i += 2 짝수/홀수, i += 3 3의 배수 등..)
 */
public class 제어문_반복문_문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 2; i <= 100; i += 2) {

			sum += i;
		}
		System.out.println("2 + 4 + ... + 100의 합 : " + sum);
		System.exit(0);
		/*
		 * 수열이 아닌 경우 (난수처럼 규칙이 없는 경우)는 for문이 사용 불가하다.
		 */
	}

}
