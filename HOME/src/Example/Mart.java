package Example;

public class Mart {

        public static void main(String[] args) {

            int month = 3;
            int dag=0;
            switch (month) {
                case 1:
                    dag=31;
                    System.out.println("January heeft "+dag+ "dagen");
                    break;
                case 2:
                    dag=28;
                    System.out.println("February heeft"+ dag+ "dagen");
                    break;
                case 3:
                    dag=30;
                    System.out.println("March heeht"+dag+"dagen");
                    break;
                case 4:
                    dag=31;
                    System.out.println("April heeft"+dag+"dagen");
                    break;
                case 5:
                    dag=30;
                    System.out.println("May heeft"+dag+"dagen");
                    break;
                case 6:
                    dag=30;
                    System.out.println("June heeft"+"dagen");
                    break;
                case 7:
                    dag=31;
                    System.out.println("July heeft"+"dagen");
                    break;
                case 8:
                    dag=30;
                    System.out.println("August heeft"+dag+"dagen");
                    break;
                case 9:
                    dag=31;
                    System.out.println("September heeft"+"dagen");
                    break;
                case 10:
                    dag=30;
                    System.out.println("October heeft"+"dagen");
                    break;
                case 11:
                    dag=30;
                    System.out.println("November heeft"+"dagen");
                    break;
                case 12:
                    dag=31;
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Month number does not exists");
                    break;
            }
        }
    }




