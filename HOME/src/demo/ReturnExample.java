package demo;

public class ReturnExample {
	public static void main(String[]args) {
		
		for ( int i=0;i<=5;i++) { 
		
			if ( i ==3) return;   // если убрать эту строку, то в ответе будет  0 1 2 3 4 5 1000
			System.out.println(i); // если  с if то ответ 0 1 2 
		}
		System.out.println(1000);
	}
}