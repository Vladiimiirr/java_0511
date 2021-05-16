package task_5_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*1. Ввести путь к файлу с консоли.
        2. Прочитать из него набор чисел.
        3. Вывести на консоль только четные, отсортированные по возрастанию.
        Пример ввода:
        5
        8
        -2
        11
        3
        -5
        2
        10
        Пример вывода:
        -2
        2
        8
        10
  */



public class Main {
    public static void main(String[] args) {
        int i;
        String str = "";
        Scanner it= new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        try {
            ArrayList <Integer> ints = new ArrayList();
            FileInputStream fog= new FileInputStream(it.next());
            while ((i=fog.read())!=-1){
                if(i!=10 & i!=13){
                    str+=""+(char)i;
                } else {
                    if (i==13)ints.add(Integer.parseInt(str));
                    str ="";
                }
            }
            ints.add(Integer.parseInt(str));

         for(int z=0;z<ints.size();z++) {
             Collections.sort(ints);
             if (ints.get(z)%2==0)
             System.out.print(ints.get(z)+" ");}
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}