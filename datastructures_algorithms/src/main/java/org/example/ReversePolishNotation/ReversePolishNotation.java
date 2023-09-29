package org.example.ReversePolishNotation;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens){
        int returnValue = 0;
        String operators = "+-*/";

        Stack<String> stack = new Stack<>();

        for(String t: tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (t){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a-b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a/b));
                        break;
                }

            }
        }
        returnValue = Integer.parseInt(stack.pop());
        return returnValue;
    }
}
