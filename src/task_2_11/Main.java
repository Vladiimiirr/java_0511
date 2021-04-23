package task_2_11;
/*
Задание: Дан массив с числами.
Узнайте сколько элементов с начала массива надо сложить,
 чтобы в сумме получилось больше 10-ти.
*/

public class Main {

    public static void main(String[] args) {
        int x [] = {3,2,2,1,3,6};
        int a =0;
        int j=0;
        for (int i=0;i<x.length; i++){
            if(a<=10){
                a+=x[i];
                j++;
            }
        }
        System.out.println(j);
    }
}