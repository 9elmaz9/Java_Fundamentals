package ExersiseProm;
/* Створіть застосування що знаходить корені рівняння виду ax2 + bx + c = 0.
Коефіцієнти задаються через змінні:
double a;
double b;
double c;
Примітка: для обрахування квадратного кореня використовуйте конструкцію Math.sqrt(). Наприклад:
double x = Math.sqrt(4);
після виконання х буде рівним 2

Результат повинен мати наступний формат (за умови що корені, наприклад, 2 та 3):
x1=2
x2=3
Якщо корінь один (наприклад 5)
x1=5
x2=5
Якщо корені відсутні
x1=
x2=
*/
public class Exersise1 {
	public class SquareRoot {

		public static void main(String[] args) {
			// ax2 + bx + c = 0
			// 3x2+2.5x + (-0.5)=0  
			// d=b2-4ac
			// Оголошення змінних для коефіцієнтів рівняння. задаємо коефіцієнти
			double a = 3;
			double b = 2.5;
			double c = -0.5;
			
			
			// Обчислення дискримінанту
			// Це значення допомагає визначити кількість та тип коренів рівняння.
			
			double discriminant = b*b-4*a*c; // b*b это Б в квадрате 
			//2.5*2.5 -4*3*(-0.5)
		
			double x1 = Math.sqrt(2);
			double x2=Math.sqrt(3);
			double x= Math.sqrt(5);
			
			// знаходимо корені 
			// два кореня дійсних
			if (discriminant>0) {
				double x1= ( -b + Math.sqrt(discriminant))/ (2*a);
				double x2= ( -b - Math.sqrt(discriminant))/ (2*a);
				System.out.println("x1="+ x1);
				System.out.println("x2="+ x2);
			}else if (discriminant==0) {	
				//один дійсний корень , корені рівні
				double x = - b / (2*a);
				System.out.println("x1="+ x);
				System.out.println("x2="+ x);
			}else {
				System.out.println("Корені відсутні ");
			}	
		}	
	}
}

				
			
			
			
			
			
			
			
		     