import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws IOException {
        String output = null;
        String[] splitExpression = input.split(" ");
        if (splitExpression.length != 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception //т.к. ввод не соответствует условиям задачи(один операнд разделитель \" \" оператор разделитель \" \" второй операнд)");
                throw e;
            }
        } else {
            String operand1 = splitExpression[0];
            String operator = splitExpression[1];
            String operand2 = splitExpression[2];

            int number1 = Integer.parseInt(operand1);
            int number2 = Integer.parseInt(operand2);
            
            if ((number1 == 0 || number2 == 0) || (number1 > 10 || number2 > 10)) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception //т.к. на вход принимаются числа от 1 до 10");
                    throw e;

                }
            } else {
                switch (operator) {
                    case "+" -> output = Integer.toString(number1 + number2);
                    case "-" -> output = Integer.toString(number1 - number2);
                    case "*" -> output = Integer.toString(number1 * number2);
                    case "/" -> output = Integer.toString(number1 / number2);
                }
            }
        }
        return output;
    }
}
