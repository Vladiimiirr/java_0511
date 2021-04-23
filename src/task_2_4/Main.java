package task_2_4;

/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        System.out.println("Введите процент");
        double b = in.nextDouble();

        for (int j = 1; j <= 5; j++) {
            a += a / 100.0 * b;
            System.out.println(j + " год");
            System.out.println(a);
        }
    }
}
