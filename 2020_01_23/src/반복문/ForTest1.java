package 반복문;

public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//;(세미콜론)은 문장의 끝이기 때문에 ++count를 쓰던 c++을 쓰던 상관없다.
		//count<= 10 or count = 0 or count < 11 3개중 한가지 방법을 쓰면 10개가 나온다.
		for(int count = 1; count <= 10; count++) {
			System.out.print('★');
		}
		for(int count = 0; count < 10; count++) {
			System.out.print('★');
		}
		for(int count = 1; count < 11; count++) {
			System.out.print('★');
		}
		for(int count = 1; count <= 10; count++) {
			System.out.print('★');
		}
		for(int count = 10; count > 0; count--) {
			System.out.print('★');	
		}
		}
	}


