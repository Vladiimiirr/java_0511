package task_3_4;

        /*Задание: Сделайте функцию, которая принимает 2 числа.
        Если их сумма больше 10 - пусть функция вернет true,
        а если нет - false.*/



public  class  Main {
    public  static  void  main ( String [] args ) {
        int a =5;
        int b =1;
        System.out.println(fos(a,b));

    }
    public static boolean fos(int z, int x){
        boolean v;
        if(z<=x) v=true; else v=false;
        return v;}
}