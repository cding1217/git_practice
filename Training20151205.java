/*
*�����
*@auther cding
*@since 2015/12/05
*@copyright (C)
*/
public class Main { 
  public static void main(String[] args){

    	//�g�������	
	System.out.println("���Ȃ��̐g������͂��Ă�������(cm)");
	int a;
	a = new java.util.Scanner (System.in).nextInt();
	System.out.println(a + "cm");

	//�W���̏d��\��
	int b;
	b = a - 110;
	System.out.println("���Ȃ��̕W���̏d��" + b +"kg�ł�");

	//���̏d�����
	System.out.println("���Ȃ��̑̏d����͂��Ă�������(kg)");
	int c;
	c = new java.util.Scanner (System.in).nextInt();
	System.out.println(c + "kg");

	//�̌^�𔻒�
	if (c - b >= 10){
		System.out.println("���Ȃ��͌y�얞�ł��B");
	}else if (b - c >=10 ){
		System.out.println("���Ȃ��͑����^�ł��B");
	}else {
		System.out.println("���Ȃ��̕W���̌^�ł��B");
	}
	
  }
}