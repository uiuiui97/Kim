package �񱳹�;
/*
 * �����ڵ� gederCode
 * f F ����
 * m M ����
 *  ���� ���� �Է¿���
 *  f, F, m, M ==> ���� char
 *  ����, ����, �Է¿��� ==> ���ڿ� String
 *  
 */
public class Switch�����ڵ�Test2 {
	public static void main(String[] args) {
	
	char genderCode = 'f';
	String genderCase = "�Է¿���";
	 switch(genderCode) {
      case 'f' :
    	 genderCase = "����";
	     break;
	  case 'F' :
		  genderCase = "����";
	      break;
	  case 'M' :
		  genderCase = "����";
		  break;
	  case 'm' :
		  genderCase = "����";
		  break; 
		      
	  
	 
	  
   }
	 System.out.println("�����ڵ�:"+genderCode+":"+genderCase);
	 System.out.printf(" %c : %s \n", genderCode, genderCase);
}
}