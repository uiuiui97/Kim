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
public class Switch�����ڵ�Test1 {
	public static void main(String[] args) {
	
	char genderCode = 'F';
	String genderCase;
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
	  
	  default :
		  genderCase = "�Է¿���";
		  break;
   }
	 System.out.println("�����ڵ�:"+genderCode+":"+genderCase);
	 System.out.println("%c : %s \n"+genderCode+":"+genderCase);
}
}