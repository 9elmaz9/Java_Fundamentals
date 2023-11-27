package Oefening1;

class Calculator {
    // creating a basis for calculation
    static int findSmallestNumber(int num1, int num2, int num3) { //Method to find the smallest number among 3 numbers
        return Math.min(Math.min(num1, num2), num3);
    }

    static int findGrootsteNumber(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);

    }

    static int add(int num1, int num2) { //SUM
        return num1 + num2;
    }

    static int sub(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static int modulus(int num1, int num2) {
        return num1 % num2;
    }

   /* static boolean divide(double num1, double num2) { // making it impossible to divide by zero
        if (num2 != 0) { // making it impossible to divide by zero
            return num1 / num2;
        } else {
            System.out.println("Kan niet door nul delen.");
            return Double.NaN;  // "Not a Number"
        }*/


    static double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error:Division by zero!");
            return 0;
        }
        return (double) num1 / num2;
    }


    // Method to check if each digit of an integer is even
    public static boolean areAllDigitsEven(int num) {
        // Convert the integer to a string
        String number = String.valueOf(num);

        // Loop through each character (digit) in the string representation of the number
        for (int i = 0; i < number.length(); i++) {

            // Get the numeric value of the ith character (digit)
            int digit = Character.getNumericValue(number.charAt(i));

            // Check if the number is odd (not divisible by 2)
            if (digit % 2 != 0) {
                // If one digit is odd, return false
                // because this means the integer is odd
                return false;  //even if one digit is odd, the whole number is odd
            }
        }
        // If the loop is completed and no odd digit is found,
        // then all numbers are even, return true
        return true;// all numbers are even
    }
}











