/*
*自主練
*@auther cding
*@since 2015/12/02
*@copyright (C)
*/
public class Main { 
  public static void main(String[] args){

	//身長を入力	
	System.out.println("あなたの身長を入力してください(cm)");

	int a;
	a = new java.util.Scanner ( System.in ).nextInt ();

	System.out.println(a + "cm");

	//標準体重を表示
	System.out.println("あなたの標準体重は" + (a - 110) +"kgです");

  }
}