package 비교문;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a = 4;
       //만족하면 그대로 만족안하면 if대로
       String resultString= "큰 양수";
       if(a < 0) {
    	   
    	  resultString = "작은 음수";
    	  
       }
       //공통적으로 처리할 자리
       System.out.println(
    		   "a = "+a+"이므로 0보다"+ resultString +" 입니다.");
	}// main() method end

}//IfTest1 end
