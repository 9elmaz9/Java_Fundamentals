package demo;

public class ByteLongCasting {
	public static void main(String[]args) {
		
		 //byte a = 10; // так не работает
		 //a = a*10;
		 //System.out.println(a);
		
		
		byte a = 10; // так  работает = 100
		a = (byte) (a*10);
		System.out.println(a);
		
		
		
		//ong a =10;
		//a=a*10; 
		//System.out.println(a);  // ответ 100
  }
}