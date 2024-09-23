
import java.util.Scanner;

public class Go {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введи любое выражение");
        String input = sc.nextLine();
        String result = calc(input);
        System.out.println("Ваш ответ " + result);
    }
    public static String calc(String input){
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String oper = parts[1];

        if (parts.length !=3){
            throw new IllegalArgumentException("Неверный формат ввода. Ожидается: 'число оператор число'.");
        }

        int result;

        if (a<1 | a>10 | b<1 | b>10){
            throw new IllegalArgumentException("Неверный формат ввода. Ожидаются числа от 1 до 10");
        }
        switch (oper){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                throw new IllegalArgumentException("Неверный формат ввода. Ожидается: 'число оператор число'.");
        }
        return String.valueOf(result);
    }
}
