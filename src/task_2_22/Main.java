package task_2_22;
/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */

public class Main {

    public static void main(String[] args) {
        int a = 1;

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print((i * a) + "  ");
            }
            System.out.println();
            a++;
        }
    }
}