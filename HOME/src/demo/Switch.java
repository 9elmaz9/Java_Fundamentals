package demo;

public class Switch {
	

	public static void main(String[]args) {
		
		 String test = "Hello";
		 
		 switch (test){
			 case"Hello":
				 System.out.println(1);
				 System.out.println(10);
				 break; // говорит о том что операторт должен выполнить свою работу , пока не встретит брейк 
			 case"World":
				 System.out.println(2);
				 break;  // если хотим выполнить только 1 оператор , иначе будет идти до конца 
			 default: 
				 System.out.println(3);
		 }
		 
	}

}
