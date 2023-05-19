package Calculator;

//import

import java.util.Scanner;

public class Ac {
    public static void main(String[] args) {
        //Assembly scanner
        Scanner input = new Scanner(System.in);

        //Creating while condition
        boolean conWhile = true;

        //Creating value named total
        int total = 0;

        while (conWhile) {

            //Take number1
            System.out.println("enter number");
            int num = input.nextInt();

            //Choosing operator
            System.out.println("Which operator do you want to use? (+, -, *, /) Enter 'c' to clear or 'exit' to exit.");
            String operator = input.next();

            if (operator.equalsIgnoreCase("exit")) {
                conWhile = false;
            } else if (operator.equalsIgnoreCase("c")) {
                total = 0;
                System.out.println("Total has been reset to 0");
            } else {
                if (operator.equals("+")) {
                    total = add(total, num);
                } else if (operator.equals("-")) {
                    total = sub(total, num);
                } else if (operator.equals("*")) {
                    total = multiply(total, num);
                } else if (operator.equals("/")) {
                    total = divide(total, num);
                }
                System.out.println("Total: " + total);
            }
        }
    }

    // Creating classes for make math operations

    public static int add(int total, int num) {
        return total + num;
    }

    public static int sub(int total, int num) {
        return total - num;
    }

    public static int divide(int total, int num) {
        return total / num;
    }

    public static int multiply(int total, int num) {
        return total * num;
    }


}
