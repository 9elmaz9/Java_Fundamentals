package Oefening;

public class OuterClass {
    //parameters
    private double num1;
    private double num2;

    //constructor
    public OuterClass(double num1, double num2) { // const
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(double num2) {

        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }


    //creeren InnerClass

    public class MathFunction { // внутренний класс
        public double sum() {
            return num1 + num2;
        }


        public double min() {  //метод возвр наименьшего числа
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        }

        public double max() {
            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }

        public double product() {
            return num1 * num2;
        }

        public double division(){
            if(num2!=0){
                return (double) num1/num2;
            }else{
                System.out.println("Cannot divide by zero.");
                return Double.NaN;
            }
        }

    }
}
