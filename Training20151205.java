/*
*自主練
*@auther cding
*@since 2015/12/05
*@copyright (C)
*/
public class Main { 
  public static void main(String[] args){

    	//身長を入力	
	System.out.println("あなたの身長を入力してください(cm)");
	int a;
	a = new java.util.Scanner (System.in).nextInt();
	System.out.println(a + "cm");

	//標準体重を表示
	int b;
	b = a - 110;
	System.out.println("あなたの標準体重は" + b +"kgです");

	//現体重を入力
	System.out.println("あなたの体重を入力してください(kg)");
	int c;
	c = new java.util.Scanner (System.in).nextInt();
	System.out.println(c + "kg");

	//体型を判定
	if (c - b >= 10){
		System.out.println("あなたは軽肥満です。");
	}else if (b - c >=10 ){
		System.out.println("あなたは痩せ型です。");
	}else {
		System.out.println("あなたの標準体型です。");
	}
	
  }
}