package demo;

public class PrePostDemo {
	
	public static void main (String[]args) {
		int i = 3;
		i++;
		System.out.println(i); //4
		++i;  // тут уже 4 , потому что ++3=4 , ++ =1  1+3=' 
		System.out.println(i); //5    .4 +1= 5 
		System.out.println(++i); //6   : 1+5=6  после кажого систем принта плюс 1 
		System.out.println(i++);//6
		System.out.println(i); //7
		
	}

}
