package 비교문;

/*
 * 도시코드 1 : 서울, 2: 부산, 3: 광주, 1~3이 아니면 기타지역
 * ==> 출력폼
 * 도시코드 1 : 서울
 * 도시코드 6 : 기타지역
 * ==> 과제 : if문으로 바꾸어서 제출
 */
public class SwitchCaseTest1 {

	public static void main(String[] args) {
       int cityCode = 1;
       String cityName;
     //정수 이거나 문자열의 결과를 내는 연산식
       switch(cityCode) {
         case 1 :
        	 cityName = "서울";
    	  //break;
    	  case 2 :
    		  cityName = "부산";
    	  //break;
    	  case 3 :
    		  cityName = "광주";
    	  
    	 // break;
    	  default:
    		  cityName = "기타지역";
    		 // break;
    		  
       }
   System.out.println("도시코드:"+cityCode+":"+cityName);

	}

}
