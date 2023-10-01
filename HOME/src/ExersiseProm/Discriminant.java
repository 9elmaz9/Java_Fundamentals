package ExersiseProm;
import java.util.Scanner;
public class Discriminant {
	

	    public static void main(String[] args) {
	        // Оголошення змінних для коефіцієнтів рівняння
	        double a, b, c;

	        // Введення коефіцієнтів користувачем
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Введіть коефіцієнт a: ");
	        a = scanner.nextDouble();
	        System.out.print("Введіть коефіцієнт b: ");
	        b = scanner.nextDouble();
	        System.out.print("Введіть коефіцієнт c: ");
	        c = scanner.nextDouble();

	        // Обчислення дискримінанту
	        double discriminant = b * b - 4 * a * c;

	        // Перевірка значень дискримінанту і обчислення коренів
	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("x1=" + root1);
	            System.out.println("x2=" + root2);
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            System.out.println("x1=" + root);
	            System.out.println("x2=" + root);
	        } else {
	            System.out.println("Корені відсутні");
	        }
	    
	        
	}

}
