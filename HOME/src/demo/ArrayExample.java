package demo;

public class ArrayExample {
	
public static void main(String[]args) {
	
	int anArray[]=new int[10];
	anArray[0]=100;
	anArray[1]=200;
	
	//System.out.println(anArray[10]); //будет error , нужно сделать как в след. строчке 
	System.out.println(anArray.length);  // не знаем размер  инициализованного масива, то используем єтот метод
	

}
}