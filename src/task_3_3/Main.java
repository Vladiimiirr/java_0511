package task_3_3;


      /*  Задание: Сделайте функцию, которая принимает 2 числа.
      Если эти числа равны - пусть функция вернет true,
      а если не равны - false.*/



public  class  Main {
    public  static  void  main ( String [] args ) {
        int a =5;
        int b =15;
        System.out.println(fos(a,b));

    }
    public static boolean fos(int z, int x){
        boolean v;
        if(z<=x) v=true; else v=false;
        return v;}

}