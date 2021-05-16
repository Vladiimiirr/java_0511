package task_2_10;
/*
Задание: Дан массив с числами. Проверьте,
 есть ли в нем два одинаковых числа подряд.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/


public class Main {
    public static void main(String[] args) {
        int x [] = {2,0,2,3,6,2,2,7,8,4};
        int a=0;
        int b =1;

        for (int i=1;i<x.length; i++) {
            if(x[a]==x [i]){
                System.out.println("Да");
                b=0;
            }
            else { if (x.length-1 == b)
                {
                    System.out.println("Нет");
                }
            }
            a++;
            b++;
        }
    }
}