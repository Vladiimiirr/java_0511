package task_5_3;

/*
        * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
        * Коллекции вы создаёте сами
        */

import  java.util.ArrayList ;
import java.util.Collections;
import java.util.Comparator;

public  class  Main {
    public  static  void  main ( String [] args ) {
        ArrayList <Integer> str = new ArrayList();
        str.add(4);
        str.add(3);
        str.add(2);
        str.add(6);
        str.add(1);
        str.add(-14);
        str.add(-56);
        str.add(9);
        str.add(10);
        str.add(18);
        str.add(12);
        str.add(41);
        str.add(31);
        str.add(7);
        str.add(-2);
        str.add(-6);
        str.add(-1);
        int a = 0;

        ArrayList <Integer> new_str = new ArrayList();
        for (int i =0;i<str.size();i++){
            if(str.get(i)<=10 & str.get(i)>=0)
                new_str.add(str.get(i));
        }
        Collections.sort(new_str);
        System.out.println(new_str);

    }
}