package task_2_8;

/*
Задание: Дан массив с элементами [2, 3, 4, 5].
С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int a= 1;
        int x[] ={2,3,4,5};
        for (int z:x) {
            a*=z;
        }
        System.out.println(a);
    }
}