package task_2_6;

/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится' и результат деления, иначе выведите
 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        double a=5.0;
        double b =9.0;
        double c = a/b;
        System.out.println(c);

        if(a%b==0){
            System.out.println("Делится "+c);
        }
        else {
            System.out.println("Делится с остатком "+c);
        }
    }
}