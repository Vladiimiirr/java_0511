package task_3_5;

/*
Задание: Дан массив с числами.
Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static int g=0;
    public static void main(String [] ars) {
        int num[] = {4,2,6,2,65};
        rop(num);
    }

    public static int rop (int z[]){
        int i=0;
        g++;
        int c=z[z.length-g];
        System.out.print(c+" ");
        if(i==z.length-g){return 0;}
        rop(z);
        return z[0];}
}