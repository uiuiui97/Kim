package 비교문;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = -4;
       String resultString; //선언해준것.
       if(a < 0) {
    	  resultString = " 작은 음수";
    	  
       }else {
    	 //a = 4이므로 0보다 큰 양수 입니다.
    	   resultString = " 큰 양수";
       }
       //공통적으로 처리할 자리
       System.out.println(
    		   "a = "+a+"이므로 0보다"+ resultString +" 입니다.");
	}// main() method end

}//IfTest1 end
