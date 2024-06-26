// 1 ~ 10까지 출력하는 메서드를 구현하시오.
/*
 * 	메서드 = 전체 소스를 분리해서 작업한다. (분업화)
 * 	1) 형식
 * 		리턴형 메서드 명(매개 변수) {			========>	선언부 (원형)
 * 		  |			------- 매개 변수 존재 여부
 * 		---- 리턴형 존재 여부
 * 			
 * 			=> 구현
 * 			return 값 => void 일 경우에는 생략할 수 있다.
 * 		}
 * 	2) 유형
 * 		리턴형	매개 변수
 * 		 O		   O
 * 		 O		   X
 * 		 X		   O
 * 		 X		   X
 * 	3) 구현 {
 * 		구현 => 연산자 / 제어문
 * 		}
 * 	4) 호출
 * 		리턴형이 있는 경우
 * 		=> 데이터형 변수 필요 = 메서드 명()
 * 		리턴형이 없는 경우
 * 		메서드 명()
 * 
 * 		------------------------------
 * 		매개 변수 => 메서드 (값1, 값2, 값3)
 * 		** 메서드는 호출 시 마다 처음부터 다시 수행한다.
 * 		** 객체 지향의 3대 요소
 * 			---------------	변수, 메서드, 생성자
 * 							---  ----  ----
 * 		** 클래스는 1개 기능만 가지고 있다.
 * 				 -------- 세분화 : 메서드
 * 				예) class 예약 {			=======> 웹 프로그램 조립
 * 					1. 맛집 목록 출력
 * 					2. 맛집 클릭 시 예약일 출력
 * 					3. 예약일 클릭 시 예약 가능 시간 
 * 					4. 시간 클릭 시 => 인원 수 선택
 * 					5. 예약 버튼 활성화
 * 					}
 */
import java.util.*;

public class 메서드_문제_1 {
	static void numb() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		numb();

	}
}
