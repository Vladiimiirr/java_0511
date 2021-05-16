package task_1_7;
import java.util.Scanner;


/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите a");
        int  a = s.nextInt();
        System.out.println("Введите b");
        int  b = s.nextInt();
        System.out.println("Введите c");
        int  c = s.nextInt();
        System.out.println("Объем равен ");
        System.out.println(a*b*c);

    }
}