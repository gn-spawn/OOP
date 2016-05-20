package ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int sum_numbers = 0;
        double average_numbers = 0;
        System.out.println("複数の整数値を入力してください。");
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("入力された行は、");
        for (int number: numbers) {
            sum_numbers += number;
            average_numbers = sum_numbers / numbers.size();
            System.out.println(number);
        }
        System.out.println(sum_numbers);
        System.out.println(average_numbers);
    }
}