package 비교문;

public class 삼항연산자Test {
	public static void main(String[] args) {
		int a = -78;
		String resultString = ( a < 0 )? "작은 음수" : "큰 양수";
		System.out.println(
	    		   "a = "+a+"이므로 0보다 "+ resultString +" 입니다.");
	}
}
