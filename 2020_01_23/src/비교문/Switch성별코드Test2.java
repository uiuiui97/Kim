package 비교문;
/*
 * 성별코드 gederCode
 * f F 여자
 * m M 남자
 *  외의 것은 입력오류
 *  f, F, m, M ==> 문자 char
 *  남자, 여자, 입력오류 ==> 문자열 String
 *  
 */
public class Switch성별코드Test2 {
	public static void main(String[] args) {
	
	char genderCode = 'f';
	String genderCase = "입력오류";
	 switch(genderCode) {
      case 'f' :
    	 genderCase = "여자";
	     break;
	  case 'F' :
		  genderCase = "여자";
	      break;
	  case 'M' :
		  genderCase = "남자";
		  break;
	  case 'm' :
		  genderCase = "남자";
		  break; 
		      
	  
	 
	  
   }
	 System.out.println("성별코드:"+genderCode+":"+genderCase);
	 System.out.printf(" %c : %s \n", genderCode, genderCase);
}
}