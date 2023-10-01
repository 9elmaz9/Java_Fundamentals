package ExersiseProm;

public class Discriminant2 {
	
	    public static void main(String[] args) {
	        // Задаємо коефіцієнти
	        double a = 3;
	        double b = 2.5;
	        double c = -0.5;

	        // Обчислюємо дискримінант
	        double discriminant = b * b - 4 * a * c;

	        // Знаходимо корені
	        if (discriminant > 0) {
	            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("x1=" + x1);
	            System.out.println("x2=" + x2);
	        } else if (discriminant == 0) {
	            double x = -b / (2 * a);
	            System.out.println("x1=" + x);
	            System.out.println("x2=" + x);
	        } else {
	            // Виводимо, що корені відсутні
	            System.out.println("Рівняння не має дійсних коренів");
	        }
	    }
	}



