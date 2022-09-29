package myStack;

import java.util.Scanner;
import java.util.Stack;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length();i++){
            stack.push(String.valueOf(input.charAt(i)));
        }
        String reverstring = "";
        while (!stack.isEmpty()){
            reverstring = reverstring + stack.pop();
        }
        if (input.equalsIgnoreCase(reverstring)) {
            System.out.println("It is a palindrom");

        }
        else {
            System.out.println("It is not a palindrom");
        }
    }


}

