package �񱳹�;

/*
 * �����ڵ� 1 : ����, 2: �λ�, 3: ����, 1~3�� �ƴϸ� ��Ÿ����
 * ==> �����
 * �����ڵ� 1 : ����
 * �����ڵ� 6 : ��Ÿ����
 * ==> ���� : if������ �ٲپ ����
 */
public class SwitchCaseTest1 {

	public static void main(String[] args) {
       int cityCode = 1;
       String cityName;
     //���� �̰ų� ���ڿ��� ����� ���� �����
       switch(cityCode) {
         case 1 :
        	 cityName = "����";
    	  //break;
    	  case 2 :
    		  cityName = "�λ�";
    	  //break;
    	  case 3 :
    		  cityName = "����";
    	  
    	 // break;
    	  default:
    		  cityName = "��Ÿ����";
    		 // break;
    		  
       }
   System.out.println("�����ڵ�:"+cityCode+":"+cityName);

	}

}
