package �񱳹�;
/*
 * 0���� ũ�� ���
 * 0���� ������ ����
 * ����� ������ �ƴϸ� Zero
 * ���� ���� ������ ��, ������� �������� ����� ����(��� 2������ �־����)
 * ����� 0 ���� ũ�� -> �� >0
 * ������ 0 ���� �۴� -> ��<0
 * Zero
 * ��� ==> 7�� ���
 * -7�� ����
 * 0�� Zero
 */
public class IfTest011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 7;
		String restStr = "Zero";
		if(data > 0) 
			restStr = "���";
		else if(data < 0)
			restStr = "����";
		
		System.out.println(data + "�� " + restStr);
		System.out.printf("%d�� %s \n", data, restStr);

	}

}
