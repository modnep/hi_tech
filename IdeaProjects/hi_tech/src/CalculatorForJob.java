import java.util.Scanner;

public class CalculatorForJob {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            String[] parts = input.split(" ");

            if(parts.length != 3) {
                System.out.println("throws Exception");  //т.к. строка не является математической операцией
                return;
            }

            int a, b, result;

            try {
                a = Integer.parseInt(parts[0]);
                b = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целочисленные значения от 1 до 10");
                return;
            }

            switch (parts[1]) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Ошибка: деление на 0");
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Ошибка: неверная арифметическая операция");
                    return;
            }

            System.out.println(result);
        }
    }

