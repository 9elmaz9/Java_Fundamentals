package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //
        while (true) {
            System.out.println("Enter a mathematical expression");
            String expression = scanner.nextLine();
            //cheeck
            if (expression.equalsIgnoreCase("exit")) {
                System.out.println("Program completed");
                break;

            }

            try {
                double result = evaluateExpression(expression);
                System.out.println("Result:" + result);
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }

        }
    }

    //  expression evaluate method
    private static double evaluateExpression(String expression) {

        //converting an infix expression to a postfix expression
        Queue<String> postfixQueue = infixToPostfix(expression);

        //calculating the value of a postfix expression
        return evaluatePostfix(postfixQueue);

    }


    // converting an infix expression to a postfix expression
    private static Queue<String> infixToPostfix(String infix) {
        Queue<String> postfixQueue = new LinkedList<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i=0; i <infix.length();i++){
            char c =infix.charAt(i);
            if(Character.isDigit(c)|| c =='.'){
                StringBuilder numnber =new StringBuilder();
                numnber.append(c);

                while (i+1 < infix.length()&& (Character.isDigit(infix.charAt(i+1)) ||infix.charAt(i+1)=='.')){
                    numnber.append(infix.charAt(++i));
                }
                postfixQueue.offer(numnber.toString());


     // //processing every character
     // for (char c : infix.toCharArray()) {
     //     if (Character.isDigit(c) ||c=='.') {
     //         //if the char is a digit , add it to the postfix queue
     //         postfixQueue.offer(String.valueOf(c));
            } else if (isOperator(c)) {
                while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(c)) {
                    postfixQueue.offer(operatorStack.pop().toString());
                }
                operatorStack.push(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfixQueue.offer(operatorStack.pop().toString());
                }
                operatorStack.pop();
            } else if (c == '%') {
                while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(c)) {
                    postfixQueue.offer(operatorStack.pop().toString());
                }
                operatorStack.push(c);
            }
        }
        while (!operatorStack.isEmpty()) {
            postfixQueue.offer(operatorStack.pop().toString());
        }
        return postfixQueue;
    }

    //////
    private static double evaluatePostfix(Queue<String> postfixQueue) {
        Stack<Double> operandStack = new Stack<>();

        while (!postfixQueue.isEmpty()) {
            String token = postfixQueue.poll();
           // if (Character.isDigit(token.charAt(0)) || token.equals(".")) {
            if(isNumber(token)){
                operandStack.push(Double.parseDouble(token));

            } else if (isOperator(token.charAt(0))) {
                double operand2 = operandStack.pop();
                double operand1 = operandStack.pop();

                operandStack.push(applyOperator(token.charAt(0), operand1, operand2));
            }
        }

        return operandStack.pop();
    }


    ////////
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c=='%';
    }

    private static boolean isNumber(String str){
        try {
            Double.parseDouble(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    ////
    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            default:
                throw new IllegalArgumentException("Invalid operator" + operator);

        }
    }


    /////
    private static double applyOperator(char operator,double operand1,double operand2){
        switch (operator){
            case '+':
                return operand1+operand2;
            case '-':
                return operand1-operand2;
            case '*':
                return  operand1*operand2;
            case '/':
                if(operand2==0){
                    throw new ArithmeticException("division by zero");
                }
                return operand1/operand2;
            case '%':
                return operand1%operand2;
            default:
                throw  new IllegalArgumentException("invalid operator :" +operator);
        }
    }
}
