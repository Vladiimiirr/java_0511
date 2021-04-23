package task_2_5;
import java.util.Scanner;
/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.
Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число:");
        int a =s.nextInt();
        if(a==10)
            System.out.println("Верно");
        else {
            System.out.println("Неверно");
        }
    }
}
