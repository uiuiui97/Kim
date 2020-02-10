package 반복문;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int count = 1 ; count <=3 ; ++count) {
        	System.out.print(count+"★★★★");//요자리 요거 대신에 13~15행의 내용??
        	System.out.println();
        	
        }
		
        for( int col = 1; col <=4 ; col++ ) {
			System.out.print('★');
			
       
        }	
        System.out.println("///////////");
        
        for(int count = 1 ; count <=3 ; ++count) {
        	for(int col = 1 ; count <=4 ; col++) {
        		System.out.print('★');
        }
        	System.out.println();
        	
        }
}
	}
