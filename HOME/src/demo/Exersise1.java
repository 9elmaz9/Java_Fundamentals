package demo;

public class Exersise1 {
	
	public static void main(String[]args) {
		
		int i = 10;
		int n = i++%5;  // 10%5 = 0 = потому что нет остатка 
		System.out.println(n); 
		
		
		
		int ii=10;
		int nn=++ii%5; //11 %5 =1  // 1 ответ 
		System.out.println(nn);
		 
		
		int a = 49;
		int b = 7;
		
		int result = a%b;
		System.out.println(result); // получается  0 , потому что все делится ровно 
		
		
		int a2 = 49;
		int b2 = 5;
		
		int result2 = a2%b2;
		System.out.println(result2); // получается  4 , потому что  49 делить на 5  будет 5 и остаток 4 
		// аллилуя !
		
	}

}
