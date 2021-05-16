package task_1_6;
import java.util.Scanner;

/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        double n = s.nextDouble();
        System.out.println(n/100*15+n);
    }
}