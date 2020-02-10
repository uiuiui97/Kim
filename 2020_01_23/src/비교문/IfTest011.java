package 비교문;
/*
 * 0보다 크면 양수
 * 0보다 작으면 음수
 * 양수도 음수도 아니면 Zero
 * 변수 선언 데이터 값, 양수인지 음수인지 기억할 변수(적어도 2가지가 있어야함)
 * 양수는 0 보다 크다 -> 값 >0
 * 음수는 0 보다 작다 -> 값<0
 * Zero
 * 출력 ==> 7은 양수
 * -7은 음수
 * 0은 Zero
 */
public class IfTest011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 7;
		String restStr = "Zero";
		if(data > 0) 
			restStr = "양수";
		else if(data < 0)
			restStr = "음수";
		
		System.out.println(data + "은 " + restStr);
		System.out.printf("%d은 %s \n", data, restStr);

	}

}
