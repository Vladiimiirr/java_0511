package task_2_9;

/*
Задание: Дан массив с числами.
 Проверьте, что в этом массиве есть число 5.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int x[] ={2,3,4,5};
        int i =0;
        for (int z:x) {
            i++;
            if(z==5){
                System.out.println("Да");
                i=0;
            } else { if(i==x.length)
                System.out.println("Нет");
            }
        }

    }
}