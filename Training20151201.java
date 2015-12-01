/*
*自主練
*@auther cding
*@since 2015/12/01
*@copyright (C)
*/

public class Main { 
  public static void main(String[] args){

//51P.例文

	int age = 20;
	System.out.println("私の年齢は"+ age);
	age = 31;
	System.out.println("…いや、本当の年齢は"+ age);



//52P.例文修正済みバージョン

	final double TAX = 1.08;
	int fax = 5;
	System.out.println("5万円から4万円に値下げします");
	fax = 4;
  	System.out.println("ＦＡＸの新価格（税込み）");
	System.out.println(fax * TAX +"万円");	


//56P.練習1-2
	
	int a = 3;
	int b = 5;
	int c = a * b;
	System.out.println("3×5の結果は" + c);


//56P.練習1-3
	
	boolean result = true;
	char favoriteCharacter = '駆';
	double pi = 3.14;
	long number = 314159265853979L;
	String msg = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";

	
  }
}