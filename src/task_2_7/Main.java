package task_2_7;

/*
Задание: Дано число, например 31. Проверьте,
что это число не делится ни на одно другое число кроме себя самого и единицы.
 То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30.
 Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

public class Main {
    public static void main(String[] args) {
        double a = 31;
        double b = 0;
        int f = 2;
        int h = 32;

        for (int i = 2; i <= h; i++) {
            b = a / i;
            f++;
            if (b == 1.0) {
                System.out.println("true");
                f = 0;
            } else {
                if (f == h) {
                    System.out.println("false");
                }
            }
        }

    }
}